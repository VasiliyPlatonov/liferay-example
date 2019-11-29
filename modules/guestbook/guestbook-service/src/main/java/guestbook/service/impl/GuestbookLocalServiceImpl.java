/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package guestbook.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import guestbook.exception.GuestbookNameException;
import guestbook.model.Guestbook;
import guestbook.service.base.GuestbookLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;


/**
 * The implementation of the guestbook local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>guestbook.service.GuestbookLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see GuestbookLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=guestbook.model.Guestbook",
	service = AopService.class
)
public class GuestbookLocalServiceImpl extends GuestbookLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>guestbook.service.GuestbookLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>guestbook.service.GuestbookLocalServiceUtil</code>.
	 */

	public Guestbook addGuestbook(long userId, String name,
								  ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(name);

		long guestbookId = counterLocalService.increment();

		Guestbook guestbook = guestbookPersistence.create(guestbookId);

		guestbook.setStatus(WorkflowConstants.STATUS_DRAFT);
		guestbook.setStatusByUserId(userId);
		guestbook.setStatusByUserName(user.getFullName());
		guestbook.setStatusDate(serviceContext.getModifiedDate(null));


		guestbook.setUuid(serviceContext.getUuid());

		guestbook.setUserId(userId);
		guestbook.setGroupId(groupId);
		guestbook.setCompanyId(user.getCompanyId());
		guestbook.setUserName(user.getFullName());
		guestbook.setCreateDate(serviceContext.getCreateDate(now));
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);

		WorkflowHandlerRegistryUtil.startWorkflowInstance(guestbook.getCompanyId(),
				guestbook.getGroupId(), guestbook.getUserId(), Guestbook.class.getName(),
				guestbook.getPrimaryKey(), guestbook, serviceContext);


		return guestbook;
	}

	public Guestbook updateStatus(long userId, long guestbookId, int status,
								  ServiceContext serviceContext) throws PortalException,
			SystemException {

		User user = userLocalService.getUser(userId);
		Guestbook guestbook = getGuestbook(guestbookId);

		guestbook.setStatus(status);
		guestbook.setStatusByUserId(userId);
		guestbook.setStatusByUserName(user.getFullName());
		guestbook.setStatusDate(new Date());

		guestbookPersistence.update(guestbook);

//		if (status == WorkflowConstants.STATUS_APPROVED) {
//
//			assetEntryLocalService.updateVisible(Guestbook.class.getName(),
//					guestbookId, true);
//
//		} else {
//
//			assetEntryLocalService.updateVisible(Guestbook.class.getName(),
//					guestbookId, false);
//		}

		return guestbook;
	}



		public List<Guestbook> getGuestbooks(long groupId) {

		return guestbookPersistence.findByGroupId(groupId);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end,
										 OrderByComparator<Guestbook> obc) {

		return guestbookPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end) {

		return guestbookPersistence.findByGroupId(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) {

		return guestbookPersistence.countByGroupId(groupId);
	}

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new GuestbookNameException();
		}
	}


}