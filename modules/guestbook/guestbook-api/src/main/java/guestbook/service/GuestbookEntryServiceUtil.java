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

package guestbook.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for GuestbookEntry. This utility wraps
 * <code>guestbook.service.impl.GuestbookEntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author liferay
 * @see GuestbookEntryService
 * @generated
 */
@ProviderType
public class GuestbookEntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>guestbook.service.impl.GuestbookEntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static guestbook.model.GuestbookEntry addGuestbookEntry(
			long userId, long guestbookId, String name, String email,
			String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addGuestbookEntry(
			userId, guestbookId, name, email, message, serviceContext);
	}

	public static guestbook.model.GuestbookEntry deleteGuestbookEntry(
			guestbook.model.GuestbookEntry entry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteGuestbookEntry(entry);
	}

	public static guestbook.model.GuestbookEntry deleteGuestbookEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteGuestbookEntry(entryId);
	}

	public static java.util.List<guestbook.model.GuestbookEntry>
		getGuestbookEntries(long groupId, long guestbookId) {

		return getService().getGuestbookEntries(groupId, guestbookId);
	}

	public static java.util.List<guestbook.model.GuestbookEntry>
			getGuestbookEntries(
				long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getGuestbookEntries(
			groupId, guestbookId, start, end);
	}

	public static java.util.List<guestbook.model.GuestbookEntry>
		getGuestbookEntries(
			long groupId, long guestbookId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<guestbook.model.GuestbookEntry> obc) {

		return getService().getGuestbookEntries(
			groupId, guestbookId, start, end, obc);
	}

	public static int getGuestbookEntriesCount(long groupId, long guestbookId) {
		return getService().getGuestbookEntriesCount(groupId, guestbookId);
	}

	public static guestbook.model.GuestbookEntry getGuestbookEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getGuestbookEntry(entryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static guestbook.model.GuestbookEntry updateGuestbookEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateGuestbookEntry(
			userId, guestbookId, entryId, name, email, message, serviceContext);
	}

	public static GuestbookEntryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GuestbookEntryService, GuestbookEntryService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GuestbookEntryService.class);

		ServiceTracker<GuestbookEntryService, GuestbookEntryService>
			serviceTracker =
				new ServiceTracker
					<GuestbookEntryService, GuestbookEntryService>(
						bundle.getBundleContext(), GuestbookEntryService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}