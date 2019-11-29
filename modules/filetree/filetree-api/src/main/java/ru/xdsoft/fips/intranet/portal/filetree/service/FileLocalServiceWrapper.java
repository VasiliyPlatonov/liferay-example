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
 * Provides a wrapper for {@link FileLocalService}.
 *
 * @author Vasiliy Platonov
 * @see FileLocalService
 * @generated
 */
@ProviderType
public class FileLocalServiceWrapper
	implements FileLocalService, ServiceWrapper<FileLocalService> {

	public FileLocalServiceWrapper(FileLocalService fileLocalService) {
		_fileLocalService = fileLocalService;
	}

	/**
	 * Adds the file to the database. Also notifies the appropriate model listeners.
	 *
	 * @param file the file
	 * @return the file that was added
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File addFile(
		ru.xdsoft.fips.intranet.portal.filetree.model.File file) {

		return _fileLocalService.addFile(file);
	}

	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File addFile(
			String name, String url, String resourceType, long parentId,
			long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileLocalService.addFile(
			name, url, resourceType, parentId, userId, serviceContext);
	}

	/**
	 * Creates a new file with the primary key. Does not add the file to the database.
	 *
	 * @param id the primary key for the new file
	 * @return the new file
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File createFile(
		long id) {

		return _fileLocalService.createFile(id);
	}

	/**
	 * Deletes the file from the database. Also notifies the appropriate model listeners.
	 *
	 * @param file the file
	 * @return the file that was removed
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File deleteFile(
		ru.xdsoft.fips.intranet.portal.filetree.model.File file) {

		return _fileLocalService.deleteFile(file);
	}

	/**
	 * Deletes the file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the file
	 * @return the file that was removed
	 * @throws PortalException if a file with the primary key could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File deleteFile(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileLocalService.deleteFile(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fileLocalService.dynamicQuery();
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

		return _fileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _fileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _fileLocalService.dynamicQuery(
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

		return _fileLocalService.dynamicQueryCount(dynamicQuery);
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

		return _fileLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File fetchFile(
		long id) {

		return _fileLocalService.fetchFile(id);
	}

	/**
	 * Returns the file matching the UUID and group.
	 *
	 * @param uuid the file's UUID
	 * @param groupId the primary key of the group
	 * @return the matching file, or <code>null</code> if a matching file could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File
		fetchFileByUuidAndGroupId(String uuid, long groupId) {

		return _fileLocalService.fetchFileByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fileLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the file with the primary key.
	 *
	 * @param id the primary key of the file
	 * @return the file
	 * @throws PortalException if a file with the primary key could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File getFile(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileLocalService.getFile(id);
	}

	/**
	 * Returns the file matching the UUID and group.
	 *
	 * @param uuid the file's UUID
	 * @param groupId the primary key of the group
	 * @return the matching file
	 * @throws PortalException if a matching file could not be found
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File
			getFileByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileLocalService.getFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @return the range of files
	 */
	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.File>
		getFiles(int start, int end) {

		return _fileLocalService.getFiles(start, end);
	}

	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.File>
		getFiles(long parentId) {

		return _fileLocalService.getFiles(parentId);
	}

	/**
	 * Returns all the files matching the UUID and company.
	 *
	 * @param uuid the UUID of the files
	 * @param companyId the primary key of the company
	 * @return the matching files, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.File>
		getFilesByUuidAndCompanyId(String uuid, long companyId) {

		return _fileLocalService.getFilesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of files matching the UUID and company.
	 *
	 * @param uuid the UUID of the files
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching files, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ru.xdsoft.fips.intranet.portal.filetree.model.File>
		getFilesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ru.xdsoft.fips.intranet.portal.filetree.model.File>
					orderByComparator) {

		return _fileLocalService.getFilesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of files.
	 *
	 * @return the number of files
	 */
	@Override
	public int getFilesCount() {
		return _fileLocalService.getFilesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fileLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fileLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param file the file
	 * @return the file that was updated
	 */
	@Override
	public ru.xdsoft.fips.intranet.portal.filetree.model.File updateFile(
		ru.xdsoft.fips.intranet.portal.filetree.model.File file) {

		return _fileLocalService.updateFile(file);
	}

	@Override
	public FileLocalService getWrappedService() {
		return _fileLocalService;
	}

	@Override
	public void setWrappedService(FileLocalService fileLocalService) {
		_fileLocalService = fileLocalService;
	}

	private FileLocalService _fileLocalService;

}