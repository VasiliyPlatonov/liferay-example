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

package guestbook.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import guestbook.service.GuestbookEntryServiceUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the SOAP utility for the
 * <code>GuestbookEntryServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>guestbook.model.GuestbookEntrySoap</code>. If the method in the
 * service utility returns a
 * <code>guestbook.model.GuestbookEntry</code>, that is translated to a
 * <code>guestbook.model.GuestbookEntrySoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author liferay
 * @see GuestbookEntryServiceHttp
 * @generated
 */
@ProviderType
public class GuestbookEntryServiceSoap {

	public static guestbook.model.GuestbookEntrySoap addGuestbookEntry(
			long userId, long guestbookId, String name, String email,
			String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			guestbook.model.GuestbookEntry returnValue =
				GuestbookEntryServiceUtil.addGuestbookEntry(
					userId, guestbookId, name, email, message, serviceContext);

			return guestbook.model.GuestbookEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap updateGuestbookEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			guestbook.model.GuestbookEntry returnValue =
				GuestbookEntryServiceUtil.updateGuestbookEntry(
					userId, guestbookId, entryId, name, email, message,
					serviceContext);

			return guestbook.model.GuestbookEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap deleteGuestbookEntry(
			guestbook.model.GuestbookEntrySoap entry)
		throws RemoteException {

		try {
			guestbook.model.GuestbookEntry returnValue =
				GuestbookEntryServiceUtil.deleteGuestbookEntry(
					guestbook.model.impl.GuestbookEntryModelImpl.toModel(
						entry));

			return guestbook.model.GuestbookEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap deleteGuestbookEntry(
			long entryId)
		throws RemoteException {

		try {
			guestbook.model.GuestbookEntry returnValue =
				GuestbookEntryServiceUtil.deleteGuestbookEntry(entryId);

			return guestbook.model.GuestbookEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap[] getGuestbookEntries(
			long groupId, long guestbookId)
		throws RemoteException {

		try {
			java.util.List<guestbook.model.GuestbookEntry> returnValue =
				GuestbookEntryServiceUtil.getGuestbookEntries(
					groupId, guestbookId);

			return guestbook.model.GuestbookEntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap[] getGuestbookEntries(
			long groupId, long guestbookId, int start, int end)
		throws RemoteException {

		try {
			java.util.List<guestbook.model.GuestbookEntry> returnValue =
				GuestbookEntryServiceUtil.getGuestbookEntries(
					groupId, guestbookId, start, end);

			return guestbook.model.GuestbookEntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap[] getGuestbookEntries(
			long groupId, long guestbookId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<guestbook.model.GuestbookEntry> obc)
		throws RemoteException {

		try {
			java.util.List<guestbook.model.GuestbookEntry> returnValue =
				GuestbookEntryServiceUtil.getGuestbookEntries(
					groupId, guestbookId, start, end, obc);

			return guestbook.model.GuestbookEntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static guestbook.model.GuestbookEntrySoap getGuestbookEntry(
			long entryId)
		throws RemoteException {

		try {
			guestbook.model.GuestbookEntry returnValue =
				GuestbookEntryServiceUtil.getGuestbookEntry(entryId);

			return guestbook.model.GuestbookEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getGuestbookEntriesCount(long groupId, long guestbookId)
		throws RemoteException {

		try {
			int returnValue =
				GuestbookEntryServiceUtil.getGuestbookEntriesCount(
					groupId, guestbookId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		GuestbookEntryServiceSoap.class);

}