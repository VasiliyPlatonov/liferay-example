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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import guestbook.service.GuestbookEntryServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the HTTP utility for the
 * <code>GuestbookEntryServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author liferay
 * @see GuestbookEntryServiceSoap
 * @generated
 */
@ProviderType
public class GuestbookEntryServiceHttp {

	public static guestbook.model.GuestbookEntry addGuestbookEntry(
			HttpPrincipal httpPrincipal, long userId, long guestbookId,
			String name, String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "addGuestbookEntry",
				_addGuestbookEntryParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, guestbookId, name, email, message,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (guestbook.model.GuestbookEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static guestbook.model.GuestbookEntry updateGuestbookEntry(
			HttpPrincipal httpPrincipal, long userId, long guestbookId,
			long entryId, String name, String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "updateGuestbookEntry",
				_updateGuestbookEntryParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, guestbookId, entryId, name, email, message,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				if (e instanceof
						com.liferay.portal.kernel.exception.SystemException) {

					throw (com.liferay.portal.kernel.exception.SystemException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (guestbook.model.GuestbookEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static guestbook.model.GuestbookEntry deleteGuestbookEntry(
			HttpPrincipal httpPrincipal, guestbook.model.GuestbookEntry entry)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "deleteGuestbookEntry",
				_deleteGuestbookEntryParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, entry);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (guestbook.model.GuestbookEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static guestbook.model.GuestbookEntry deleteGuestbookEntry(
			HttpPrincipal httpPrincipal, long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "deleteGuestbookEntry",
				_deleteGuestbookEntryParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, entryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (guestbook.model.GuestbookEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<guestbook.model.GuestbookEntry>
		getGuestbookEntries(
			HttpPrincipal httpPrincipal, long groupId, long guestbookId) {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "getGuestbookEntries",
				_getGuestbookEntriesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, guestbookId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<guestbook.model.GuestbookEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<guestbook.model.GuestbookEntry>
			getGuestbookEntries(
				HttpPrincipal httpPrincipal, long groupId, long guestbookId,
				int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "getGuestbookEntries",
				_getGuestbookEntriesParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, guestbookId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.SystemException) {

					throw (com.liferay.portal.kernel.exception.SystemException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<guestbook.model.GuestbookEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<guestbook.model.GuestbookEntry>
		getGuestbookEntries(
			HttpPrincipal httpPrincipal, long groupId, long guestbookId,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<guestbook.model.GuestbookEntry> obc) {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "getGuestbookEntries",
				_getGuestbookEntriesParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, guestbookId, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<guestbook.model.GuestbookEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static guestbook.model.GuestbookEntry getGuestbookEntry(
			HttpPrincipal httpPrincipal, long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "getGuestbookEntry",
				_getGuestbookEntryParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, entryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (guestbook.model.GuestbookEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getGuestbookEntriesCount(
		HttpPrincipal httpPrincipal, long groupId, long guestbookId) {

		try {
			MethodKey methodKey = new MethodKey(
				GuestbookEntryServiceUtil.class, "getGuestbookEntriesCount",
				_getGuestbookEntriesCountParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, guestbookId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		GuestbookEntryServiceHttp.class);

	private static final Class<?>[] _addGuestbookEntryParameterTypes0 =
		new Class[] {
			long.class, long.class, String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateGuestbookEntryParameterTypes1 =
		new Class[] {
			long.class, long.class, long.class, String.class, String.class,
			String.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteGuestbookEntryParameterTypes2 =
		new Class[] {guestbook.model.GuestbookEntry.class};
	private static final Class<?>[] _deleteGuestbookEntryParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getGuestbookEntriesParameterTypes4 =
		new Class[] {long.class, long.class};
	private static final Class<?>[] _getGuestbookEntriesParameterTypes5 =
		new Class[] {long.class, long.class, int.class, int.class};
	private static final Class<?>[] _getGuestbookEntriesParameterTypes6 =
		new Class[] {
			long.class, long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getGuestbookEntryParameterTypes7 =
		new Class[] {long.class};
	private static final Class<?>[] _getGuestbookEntriesCountParameterTypes8 =
		new Class[] {long.class, long.class};

}