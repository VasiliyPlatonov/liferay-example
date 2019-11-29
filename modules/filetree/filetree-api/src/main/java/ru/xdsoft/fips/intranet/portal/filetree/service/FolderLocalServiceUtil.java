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

package ru.xdsoft.fips.intranet.portal.filetree.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Folder. This utility wraps
 * <code>ru.xdsoft.fips.intranet.portal.filetree.service.impl.FolderLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Vasiliy Platonov
 * @see FolderLocalService
 * @generated
 */
@ProviderType
public class FolderLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>ru.xdsoft.fips.intranet.portal.filetree.service.impl.FolderLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the folder to the database. Also notifies the appropriate model listeners.
	 *
	 * @param folder the folder
	 * @return the folder that was added
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		addFolder(ru.xdsoft.fips.intranet.portal.filetree.model.Folder folder) {

		return getService().addFolder(folder);
	}

	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
			addFolder(
				String name, long parentId, long userId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addFolder(name, parentId, userId, serviceContext);
	}

	/**
	 * Creates a new folder with the primary key. Does not add the folder to the database.
	 *
	 * @param id the primary key for the new folder
	 * @return the new folder
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		createFolder(long id) {

		return getService().createFolder(id);
	}

	/**
	 * Deletes the folder from the database. Also notifies the appropriate model listeners.
	 *
	 * @param folder the folder
	 * @return the folder that was removed
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		deleteFolder(
			ru.xdsoft.fips.intranet.portal.filetree.model.Folder folder) {

		return getService().deleteFolder(folder);
	}

	/**
	 * Deletes the folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the folder
	 * @return the folder that was removed
	 * @throws PortalException if a folder with the primary key could not be found
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
			deleteFolder(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteFolder(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		fetchFolder(long id) {

		return getService().fetchFolder(id);
	}

	/**
	 * Returns the folder matching the UUID and group.
	 *
	 * @param uuid the folder's UUID
	 * @param groupId the primary key of the group
	 * @return the matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		fetchFolderByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchFolderByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the folder with the primary key.
	 *
	 * @param id the primary key of the folder
	 * @return the folder
	 * @throws PortalException if a folder with the primary key could not be found
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
			getFolder(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFolder(id);
	}

	/**
	 * Returns the folder matching the UUID and group.
	 *
	 * @param uuid the folder's UUID
	 * @param groupId the primary key of the group
	 * @return the matching folder
	 * @throws PortalException if a matching folder could not be found
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
			getFolderByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFolderByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @return the range of folders
	 */
	public static java.util.List
		<ru.xdsoft.fips.intranet.portal.filetree.model.Folder> getFolders(
			int start, int end) {

		return getService().getFolders(start, end);
	}

	public static java.util.List
		<ru.xdsoft.fips.intranet.portal.filetree.model.Folder> getFolders(
			long groupId) {

		return getService().getFolders(groupId);
	}

	/**
	 * Returns all the folders matching the UUID and company.
	 *
	 * @param uuid the UUID of the folders
	 * @param companyId the primary key of the company
	 * @return the matching folders, or an empty list if no matches were found
	 */
	public static java.util.List
		<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
			getFoldersByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getFoldersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of folders matching the UUID and company.
	 *
	 * @param uuid the UUID of the folders
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching folders, or an empty list if no matches were found
	 */
	public static java.util.List
		<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
			getFoldersByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
						orderByComparator) {

		return getService().getFoldersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of folders.
	 *
	 * @return the number of folders
	 */
	public static int getFoldersCount() {
		return getService().getFoldersCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the folder in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param folder the folder
	 * @return the folder that was updated
	 */
	public static ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		updateFolder(
			ru.xdsoft.fips.intranet.portal.filetree.model.Folder folder) {

		return getService().updateFolder(folder);
	}

	public static FolderLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FolderLocalService, FolderLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FolderLocalService.class);

		ServiceTracker<FolderLocalService, FolderLocalService> serviceTracker =
			new ServiceTracker<FolderLocalService, FolderLocalService>(
				bundle.getBundleContext(), FolderLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}