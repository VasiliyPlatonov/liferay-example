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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link FolderLocalService}.
 *
 * @author Vasiliy Platonov
 * @see FolderLocalService
 * @generated
 */
@ProviderType
public class FolderLocalServiceWrapper
	implements FolderLocalService, ServiceWrapper<FolderLocalService> {

	public FolderLocalServiceWrapper(FolderLocalService folderLocalService) {
		_folderLocalService = folderLocalService;
	}

	/**
	 * Adds the folder to the database. Also notifies the appropriate model listeners.
	 *
	 * @param folder the folder
	 * @return the folder that was added
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder addFolder(
		ru.xdsoft.fips.intranet.portal.filetree.model.Folder folder) {

		return _folderLocalService.addFolder(folder);
	}

	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder addFolder(
			String name, long parentId, long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _folderLocalService.addFolder(
			name, parentId, userId, serviceContext);
	}

	/**
	 * Creates a new folder with the primary key. Does not add the folder to the database.
	 *
	 * @param id the primary key for the new folder
	 * @return the new folder
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder createFolder(
		long id) {

		return _folderLocalService.createFolder(id);
	}

	/**
	 * Deletes the folder from the database. Also notifies the appropriate model listeners.
	 *
	 * @param folder the folder
	 * @return the folder that was removed
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder deleteFolder(
		ru.xdsoft.fips.intranet.portal.filetree.model.Folder folder) {

		return _folderLocalService.deleteFolder(folder);
	}

	/**
	 * Deletes the folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the folder
	 * @return the folder that was removed
	 * @throws PortalException if a folder with the primary key could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder deleteFolder(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _folderLocalService.deleteFolder(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _folderLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _folderLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _folderLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _folderLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _folderLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _folderLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _folderLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder fetchFolder(
		long id) {

		return _folderLocalService.fetchFolder(id);
	}

	/**
	 * Returns the folder matching the UUID and group.
	 *
	 * @param uuid the folder's UUID
	 * @param groupId the primary key of the group
	 * @return the matching folder, or <code>null</code> if a matching folder could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder
		fetchFolderByUuidAndGroupId(String uuid, long groupId) {

		return _folderLocalService.fetchFolderByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _folderLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the folder with the primary key.
	 *
	 * @param id the primary key of the folder
	 * @return the folder
	 * @throws PortalException if a folder with the primary key could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder getFolder(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _folderLocalService.getFolder(id);
	}

	/**
	 * Returns the folder matching the UUID and group.
	 *
	 * @param uuid the folder's UUID
	 * @param groupId the primary key of the group
	 * @return the matching folder
	 * @throws PortalException if a matching folder could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder
			getFolderByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _folderLocalService.getFolderByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
		getFolders(int start, int end) {

		return _folderLocalService.getFolders(start, end);
	}

	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
		getFolders(long groupId) {

		return _folderLocalService.getFolders(groupId);
	}

	/**
	 * Returns all the folders matching the UUID and company.
	 *
	 * @param uuid the UUID of the folders
	 * @param companyId the primary key of the company
	 * @return the matching folders, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
		getFoldersByUuidAndCompanyId(String uuid, long companyId) {

		return _folderLocalService.getFoldersByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
		getFoldersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ru.xdsoft.fips.intranet.portal.filetree.model.Folder>
					orderByComparator) {

		return _folderLocalService.getFoldersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of folders.
	 *
	 * @return the number of folders
	 */
	@Override
	public int getFoldersCount() {
		return _folderLocalService.getFoldersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _folderLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _folderLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _folderLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the folder in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param folder the folder
	 * @return the folder that was updated
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.Folder updateFolder(
		ru.xdsoft.fips.intranet.portal.filetree.model.Folder folder) {

		return _folderLocalService.updateFolder(folder);
	}

	@Override
	public FolderLocalService getWrappedService() {
		return _folderLocalService;
	}

	@Override
	public void setWrappedService(FolderLocalService folderLocalService) {
		_folderLocalService = folderLocalService;
	}

	private FolderLocalService _folderLocalService;

}