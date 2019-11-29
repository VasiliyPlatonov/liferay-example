/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ru.xdsoft.fips.intranet.portal.filetree.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import ru.xdsoft.fips.intranet.portal.filetree.exception.FileNameException;
import ru.xdsoft.fips.intranet.portal.filetree.model.File;
import ru.xdsoft.fips.intranet.portal.filetree.service.base.FileLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>ru.xdsoft.fips.intranet.portal.filetree.service.FileLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vasiliy Platonov
 * @see FileLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=ru.xdsoft.fips.intranet.portal.filetree.model.File",
        service = AopService.class
)
public class FileLocalServiceImpl extends FileLocalServiceBaseImpl {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>ru.xdsoft.fips.intranet.portal.filetree.service.FileLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ru.xdsoft.fips.intranet.portal.filetree.service.FileLocalServiceUtil</code>.
     */

    public List<File> getFiles(long parentId) {
        return filePersistence.findByParentId(parentId);
    }

    public File addFile(String name, String url, String resourceType,
                        long parentId, long userId, ServiceContext serviceContext) throws PortalException {

        long groupId = serviceContext.getScopeGroupId();
        User user = userLocalService.getUserById(userId);

        validate(name);

        long fileId = counterLocalService.increment();
        File file = filePersistence.create(fileId);

        file.setGroupId(groupId);
        file.setCompanyId(user.getCompanyId());

        file.setName(name);
        file.setUrl(url);
        file.setResourceType(resourceType);
        file.setParentId(parentId);
        file.setExpandoBridgeAttributes(serviceContext);

		filePersistence.update(file);

		return file;
    }


    protected void validate(String name) throws PortalException {
        if (Validator.isNull(name)) {
            throw new FileNameException();
        }
    }
}