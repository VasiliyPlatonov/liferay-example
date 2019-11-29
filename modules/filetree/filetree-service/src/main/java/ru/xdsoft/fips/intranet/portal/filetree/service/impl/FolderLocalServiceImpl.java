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
import ru.xdsoft.fips.intranet.portal.filetree.exception.FolderNameException;
import ru.xdsoft.fips.intranet.portal.filetree.model.Folder;
import ru.xdsoft.fips.intranet.portal.filetree.service.base.FolderLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the folder local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>ru.xdsoft.fips.intranet.portal.filetree.service.FolderLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vasiliy Platonov
 * @see FolderLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=ru.xdsoft.fips.intranet.portal.filetree.model.Folder",
        service = AopService.class
)
public class FolderLocalServiceImpl extends FolderLocalServiceBaseImpl {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>ru.xdsoft.fips.intranet.portal.filetree.service.FolderLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ru.xdsoft.fips.intranet.portal.filetree.service.FolderLocalServiceUtil</code>.
     */

    public List<Folder> getFolders(long groupId) {
        return folderPersistence.findByGroupId(groupId);
    }

    public Folder addFolder(String name, long parentId, long userId, ServiceContext serviceContext)
            throws PortalException {

        long groupId = serviceContext.getScopeGroupId();
        User user = userLocalService.getUserById(userId);

        validate(name);

        long folderId = counterLocalService.increment();
        Folder folder = folderPersistence.create(folderId);

        folder.setGroupId(groupId);
        folder.setCompanyId(user.getCompanyId());

        folder.setName(name);
        folder.setParentId(parentId);
        folder.setExpandoBridgeAttributes(serviceContext);

        folderPersistence.update(folder);

        return folder;

    }

    protected void validate(String name) throws PortalException {
        if (Validator.isNull(name)) {
            throw new FolderNameException();
        }
    }
}