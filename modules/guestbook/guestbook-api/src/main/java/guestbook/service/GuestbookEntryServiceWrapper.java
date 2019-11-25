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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link GuestbookEntryService}.
 *
 * @author liferay
 * @see GuestbookEntryService
 * @generated
 */
@ProviderType
public class GuestbookEntryServiceWrapper
	implements GuestbookEntryService, ServiceWrapper<GuestbookEntryService> {

	public GuestbookEntryServiceWrapper(
		GuestbookEntryService guestbookEntryService) {

		_guestbookEntryService = guestbookEntryService;
	}

	@Override
	public guestbook.model.GuestbookEntry addGuestbookEntry(
			long userId, long guestbookId, String name, String email,
			String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryService.addGuestbookEntry(
			userId, guestbookId, name, email, message, serviceContext);
	}

	@Override
	public guestbook.model.GuestbookEntry deleteGuestbookEntry(
			guestbook.model.GuestbookEntry entry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryService.deleteGuestbookEntry(entry);
	}

	@Override
	public guestbook.model.GuestbookEntry deleteGuestbookEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryService.deleteGuestbookEntry(entryId);
	}

	@Override
	public java.util.List<guestbook.model.GuestbookEntry> getGuestbookEntries(
		long groupId, long guestbookId) {

		return _guestbookEntryService.getGuestbookEntries(groupId, guestbookId);
	}

	@Override
	public java.util.List<guestbook.model.GuestbookEntry> getGuestbookEntries(
			long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _guestbookEntryService.getGuestbookEntries(
			groupId, guestbookId, start, end);
	}

	@Override
	public java.util.List<guestbook.model.GuestbookEntry> getGuestbookEntries(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<guestbook.model.GuestbookEntry> obc) {

		return _guestbookEntryService.getGuestbookEntries(
			groupId, guestbookId, start, end, obc);
	}

	@Override
	public int getGuestbookEntriesCount(long groupId, long guestbookId) {
		return _guestbookEntryService.getGuestbookEntriesCount(
			groupId, guestbookId);
	}

	@Override
	public guestbook.model.GuestbookEntry getGuestbookEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryService.getGuestbookEntry(entryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guestbookEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public guestbook.model.GuestbookEntry updateGuestbookEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _guestbookEntryService.updateGuestbookEntry(
			userId, guestbookId, entryId, name, email, message, serviceContext);
	}

	@Override
	public GuestbookEntryService getWrappedService() {
		return _guestbookEntryService;
	}

	@Override
	public void setWrappedService(GuestbookEntryService guestbookEntryService) {
		_guestbookEntryService = guestbookEntryService;
	}

	private GuestbookEntryService _guestbookEntryService;

}