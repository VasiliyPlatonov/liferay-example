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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

import ru.xdsoft.fips.intranet.portal.filetree.exception.NoSuchFileException;
import ru.xdsoft.fips.intranet.portal.filetree.model.File;

/**
 * The persistence interface for the file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vasiliy Platonov
 * @see FileUtil
 * @generated
 */
@ProviderType
public interface FilePersistence extends BasePersistence<File> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FileUtil} to access the file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching files
	 */
	public java.util.List<File> findByUuid(String uuid);

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
	public java.util.List<File> findByUuid(String uuid, int start, int end);

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
	public java.util.List<File> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache);

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
	public java.util.List<File> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<File> orderByComparator);

	/**
	 * Returns the first file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByUuid_First(
			String uuid, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the first file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByUuid_First(
		String uuid, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the last file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByUuid_Last(
			String uuid, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the last file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByUuid_Last(
		String uuid, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the files before and after the current file in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public File[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Removes all the files where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching files
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the file where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFileException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByUUID_G(String uuid, long groupId)
		throws NoSuchFileException;

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
	public File fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the file where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the file that was removed
	 */
	public File removeByUUID_G(String uuid, long groupId)
		throws NoSuchFileException;

	/**
	 * Returns the number of files where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching files
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching files
	 */
	public java.util.List<File> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<File> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<File> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache);

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
	public java.util.List<File> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<File> orderByComparator);

	/**
	 * Returns the first file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the first file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByUuid_C_First(
		String uuid, long companyId, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the last file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the last file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByUuid_C_Last(
		String uuid, long companyId, OrderByComparator<File> orderByComparator);

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
	public File[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Removes all the files where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching files
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the files where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching files
	 */
	public java.util.List<File> findByName(String name);

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
	public java.util.List<File> findByName(String name, int start, int end);

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
	public java.util.List<File> findByName(
		String name, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache);

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
	public java.util.List<File> findByName(
		String name, int start, int end,
		OrderByComparator<File> orderByComparator);

	/**
	 * Returns the first file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByName_First(
			String name, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the first file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByName_First(
		String name, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the last file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByName_Last(
			String name, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the last file in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByName_Last(
		String name, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the files before and after the current file in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public File[] findByName_PrevAndNext(
			long id, String name, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Removes all the files where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of files where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching files
	 */
	public int countByName(String name);

	/**
	 * Returns all the files where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the matching files
	 */
	public java.util.List<File> findByParentId(long parentId);

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
	public java.util.List<File> findByParentId(
		long parentId, int start, int end);

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
	public java.util.List<File> findByParentId(
		long parentId, int start, int end,
		OrderByComparator<File> orderByComparator, boolean useFinderCache);

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
	public java.util.List<File> findByParentId(
		long parentId, int start, int end,
		OrderByComparator<File> orderByComparator);

	/**
	 * Returns the first file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByParentId_First(
			long parentId, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the first file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByParentId_First(
		long parentId, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the last file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file
	 * @throws NoSuchFileException if a matching file could not be found
	 */
	public File findByParentId_Last(
			long parentId, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Returns the last file in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file, or <code>null</code> if a matching file could not be found
	 */
	public File fetchByParentId_Last(
		long parentId, OrderByComparator<File> orderByComparator);

	/**
	 * Returns the files before and after the current file in the ordered set where parentId = &#63;.
	 *
	 * @param id the primary key of the current file
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public File[] findByParentId_PrevAndNext(
			long id, long parentId, OrderByComparator<File> orderByComparator)
		throws NoSuchFileException;

	/**
	 * Removes all the files where parentId = &#63; from the database.
	 *
	 * @param parentId the parent ID
	 */
	public void removeByParentId(long parentId);

	/**
	 * Returns the number of files where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the number of matching files
	 */
	public int countByParentId(long parentId);

	/**
	 * Caches the file in the entity cache if it is enabled.
	 *
	 * @param file the file
	 */
	public void cacheResult(File file);

	/**
	 * Caches the files in the entity cache if it is enabled.
	 *
	 * @param files the files
	 */
	public void cacheResult(java.util.List<File> files);

	/**
	 * Creates a new file with the primary key. Does not add the file to the database.
	 *
	 * @param id the primary key for the new file
	 * @return the new file
	 */
	public File create(long id);

	/**
	 * Removes the file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the file
	 * @return the file that was removed
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public File remove(long id) throws NoSuchFileException;

	public File updateImpl(File file);

	/**
	 * Returns the file with the primary key or throws a <code>NoSuchFileException</code> if it could not be found.
	 *
	 * @param id the primary key of the file
	 * @return the file
	 * @throws NoSuchFileException if a file with the primary key could not be found
	 */
	public File findByPrimaryKey(long id) throws NoSuchFileException;

	/**
	 * Returns the file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the file
	 * @return the file, or <code>null</code> if a file with the primary key could not be found
	 */
	public File fetchByPrimaryKey(long id);

	/**
	 * Returns all the files.
	 *
	 * @return the files
	 */
	public java.util.List<File> findAll();

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
	public java.util.List<File> findAll(int start, int end);

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
	public java.util.List<File> findAll(
		int start, int end, OrderByComparator<File> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<File> findAll(
		int start, int end, OrderByComparator<File> orderByComparator);

	/**
	 * Removes all the files from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of files.
	 *
	 * @return the number of files
	 */
	public int countAll();

}