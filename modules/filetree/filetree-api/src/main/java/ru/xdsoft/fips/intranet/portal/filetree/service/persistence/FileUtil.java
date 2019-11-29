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

package ru.xdsoft.fips.intranet.portal.filetree.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import ru.xdsoft.fips.intranet.portal.filetree.model.File;

/**
 * The persistence utility for the file service. This utility wraps <code>ru.xdsoft.fips.intranet.portal.filetree.service.persistence.impl.FilePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vasiliy Platonov
 * @see FilePersistence
 * @generated
 */
@ProviderType
public class FileUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(File file) {
		getPersistence().clearCache(file);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, File> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<File> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<File> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<File> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static File update(File file) {
		return getPersistence().update(file);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static File update(File file, ServiceContext serviceContext) {
		return getPersistence().update(file, serviceContext);
	}

	/**
	 * Returns all the files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching files
	 */
	public static List<File> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @return the range of matching files
	 */
	public static List<File> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching files
	 */
	@Deprecated
	public static List<File> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching files
	 */
	public static List<File> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByUuid_First(
			String uuid, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByUuid_First(
		String uuid, OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByUuid_Last(
			String uuid, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByUuid_Last(
		String uuid, OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the files before and after the current file in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public static File[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the files where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching files
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the file where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFileException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByUUID_G(String uuid, long groupId)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching file, or <code>null</code> if a matching file could not be found
	 */
	@Deprecated
	public static File fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Returns the file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Removes the file where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the file that was removed
	 */
	public static File removeByUUID_G(String uuid, long groupId)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of files where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching files
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching files
	 */
	public static List<File> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @return the range of matching files
	 */
	public static List<File> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching files
	 */
	@Deprecated
	public static List<File> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching files
	 */
	public static List<File> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the files before and after the current file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public static File[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the files where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching files
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the files where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching files
	 */
	public static List<File> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the files where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @return the range of matching files
	 */
	public static List<File> findByName(String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the files where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching files
	 */
	@Deprecated
	public static List<File> findByName(
		String name, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the files where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching files
	 */
	public static List<File> findByName(
		String name, int start, int end,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByName_First(
			String name, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByName_First(
		String name, OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByName_Last(
			String name, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByName_Last(
		String name, OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the files before and after the current file in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public static File[] findByName_PrevAndNext(
			long id, String name, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByName_PrevAndNext(
			id, name, orderByComparator);
	}

	/**
	 * Removes all the files where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of files where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching files
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns all the files where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the matching files
	 */
	public static List<File> findByParentId(long parentId) {
		return getPersistence().findByParentId(parentId);
	}

	/**
	 * Returns a range of all the files where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @return the range of matching files
	 */
	public static List<File> findByParentId(long parentId, int start, int end) {
		return getPersistence().findByParentId(parentId, start, end);
	}

	/**
	 * Returns an ordered range of all the files where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByParentId(long, int, int, OrderByComparator)}
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching files
	 */
	@Deprecated
	public static List<File> findByParentId(
		long parentId, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByParentId(
			parentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the files where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching files
	 */
	public static List<File> findByParentId(
		long parentId, int start, int end,
		OrderByComparator<File> orderByComparator) {

		return getPersistence().findByParentId(
			parentId, start, end, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByParentId_First(
			long parentId, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByParentId_First(
			parentId, orderByComparator);
	}

	/**
	 * Returns the first file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByParentId_First(
		long parentId, OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByParentId_First(
			parentId, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public static File findByParentId_Last(
			long parentId, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByParentId_Last(
			parentId, orderByComparator);
	}

	/**
	 * Returns the last file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public static File fetchByParentId_Last(
		long parentId, OrderByComparator<File> orderByComparator) {

		return getPersistence().fetchByParentId_Last(
			parentId, orderByComparator);
	}

	/**
	 * Returns the files before and after the current file in the ordered set where parentId = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public static File[] findByParentId_PrevAndNext(
			long id, long parentId, OrderByComparator<File> orderByComparator)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByParentId_PrevAndNext(
			id, parentId, orderByComparator);
	}

	/**
	 * Removes all the files where parentId = &#63; from the database.
	 *
	 * @param parentId the parent ID
	 */
	public static void removeByParentId(long parentId) {
		getPersistence().removeByParentId(parentId);
	}

	/**
	 * Returns the number of files where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the number of matching files
	 */
	public static int countByParentId(long parentId) {
		return getPersistence().countByParentId(parentId);
	}

	/**
	 * Caches the file in the entity cache if it is enabled.
	 *
	 * @param file the file
	 */
	public static void cacheResult(File file) {
		getPersistence().cacheResult(file);
	}

	/**
	 * Caches the files in the entity cache if it is enabled.
	 *
	 * @param files the files
	 */
	public static void cacheResult(List<File> files) {
		getPersistence().cacheResult(files);
	}

	/**
	 * Creates a new file with the primary key. Does not add the file to the database.
	 *
	 * @param id the primary key for the new file
	 * @return the new file
	 */
	public static File create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the file
	 * @return the file that was removed
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public static File remove(long id)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().remove(id);
	}

	public static File updateImpl(File file) {
		return getPersistence().updateImpl(file);
	}

	/**
	 * Returns the file with the primary key or throws a <code>NoSuchFileException</code> if it could not be found.
	 *
	 * @param id the primary key of the file
	 * @return the file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public static File findByPrimaryKey(long id)
		throws ru.xdsoft.fips.intranet.portal.filetree.exception.
			NoSuchFileException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the file
	 * @return the file, or <code>null</code> if a file with the primary key could not be found
	 */
	public static File fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the files.
	 *
	 * @return the files
	 */
	public static List<File> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @return the range of files
	 */
	public static List<File> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of files
	 */
	@Deprecated
	public static List<File> findAll(
		int start, int end, OrderByComparator<File> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FileModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of files
	 * @param end the upper bound of the range of files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of files
	 */
	public static List<File> findAll(
		int start, int end, OrderByComparator<File> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the files from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of files.
	 *
	 * @return the number of files
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FilePersistence, FilePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FilePersistence.class);

		ServiceTracker<FilePersistence, FilePersistence> serviceTracker =
			new ServiceTracker<FilePersistence, FilePersistence>(
				bundle.getBundleContext(), FilePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}