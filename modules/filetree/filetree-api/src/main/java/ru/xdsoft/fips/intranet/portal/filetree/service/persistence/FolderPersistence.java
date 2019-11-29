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

import ru.xdsoft.fips.intranet.portal.filetree.exception.NoSuchFolderException;
import ru.xdsoft.fips.intranet.portal.filetree.model.Folder;

/**
 * The persistence interface for the folder service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vasiliy Platonov
 * @see FolderUtil
 * @generated
 */
@ProviderType
public interface FolderPersistence extends BasePersistence<Folder> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FolderUtil} to access the folder persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the folders where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching folders
	 */
	public java.util.List<Folder> findByUuid(String uuid);

	/**
	 * Returns a range of all the folders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @return the range of matching folders
	 */
	public java.util.List<Folder> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the folders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching folders
	 */
	@Deprecated
	public java.util.List<Folder> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Folder> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the folders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching folders
	 */
	public java.util.List<Folder> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the first folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByUuid_First(
			String uuid, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the first folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByUuid_First(
		String uuid, OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the last folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByUuid_Last(
			String uuid, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the last folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByUuid_Last(
		String uuid, OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the folders before and after the current folder in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current folder
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next folder
	 * @throws NoSuchFolderException if a folder with the primary key could not be found
	 */
	public Folder[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Removes all the folders where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of folders where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching folders
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the folder where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFolderException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByUUID_G(String uuid, long groupId)
		throws NoSuchFolderException;

	/**
	 * Returns the folder where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching folder, or <code>null</code> if a matching folder could not be found
	 */
	@Deprecated
	public Folder fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the folder where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the folder where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the folder that was removed
	 */
	public Folder removeByUUID_G(String uuid, long groupId)
		throws NoSuchFolderException;

	/**
	 * Returns the number of folders where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching folders
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the folders where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching folders
	 */
	public java.util.List<Folder> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the folders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @return the range of matching folders
	 */
	public java.util.List<Folder> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the folders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching folders
	 */
	@Deprecated
	public java.util.List<Folder> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Folder> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the folders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching folders
	 */
	public java.util.List<Folder> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the first folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the first folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the last folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the last folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the folders before and after the current folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current folder
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next folder
	 * @throws NoSuchFolderException if a folder with the primary key could not be found
	 */
	public Folder[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Removes all the folders where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of folders where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching folders
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the folders where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching folders
	 */
	public java.util.List<Folder> findByName(String name);

	/**
	 * Returns a range of all the folders where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @return the range of matching folders
	 */
	public java.util.List<Folder> findByName(String name, int start, int end);

	/**
	 * Returns an ordered range of all the folders where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching folders
	 */
	@Deprecated
	public java.util.List<Folder> findByName(
		String name, int start, int end,
		OrderByComparator<Folder> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the folders where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching folders
	 */
	public java.util.List<Folder> findByName(
		String name, int start, int end,
		OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the first folder in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByName_First(
			String name, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the first folder in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByName_First(
		String name, OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the last folder in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByName_Last(
			String name, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the last folder in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByName_Last(
		String name, OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the folders before and after the current folder in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current folder
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next folder
	 * @throws NoSuchFolderException if a folder with the primary key could not be found
	 */
	public Folder[] findByName_PrevAndNext(
			long id, String name, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Removes all the folders where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of folders where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching folders
	 */
	public int countByName(String name);

	/**
	 * Returns all the folders where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching folders
	 */
	public java.util.List<Folder> findByGroupId(long groupId);

	/**
	 * Returns a range of all the folders where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @return the range of matching folders
	 */
	public java.util.List<Folder> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the folders where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching folders
	 */
	@Deprecated
	public java.util.List<Folder> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Folder> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the folders where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching folders
	 */
	public java.util.List<Folder> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the first folder in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByGroupId_First(
			long groupId, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the first folder in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByGroupId_First(
		long groupId, OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the last folder in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder
	 * @throws NoSuchFolderException if a matching folder could not be found
	 */
	public Folder findByGroupId_Last(
			long groupId, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Returns the last folder in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching folder, or <code>null</code> if a matching folder could not be found
	 */
	public Folder fetchByGroupId_Last(
		long groupId, OrderByComparator<Folder> orderByComparator);

	/**
	 * Returns the folders before and after the current folder in the ordered set where groupId = &#63;.
	 *
	 * @param id the primary key of the current folder
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next folder
	 * @throws NoSuchFolderException if a folder with the primary key could not be found
	 */
	public Folder[] findByGroupId_PrevAndNext(
			long id, long groupId, OrderByComparator<Folder> orderByComparator)
		throws NoSuchFolderException;

	/**
	 * Removes all the folders where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of folders where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching folders
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the folder in the entity cache if it is enabled.
	 *
	 * @param folder the folder
	 */
	public void cacheResult(Folder folder);

	/**
	 * Caches the folders in the entity cache if it is enabled.
	 *
	 * @param folders the folders
	 */
	public void cacheResult(java.util.List<Folder> folders);

	/**
	 * Creates a new folder with the primary key. Does not add the folder to the database.
	 *
	 * @param id the primary key for the new folder
	 * @return the new folder
	 */
	public Folder create(long id);

	/**
	 * Removes the folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the folder
	 * @return the folder that was removed
	 * @throws NoSuchFolderException if a folder with the primary key could not be found
	 */
	public Folder remove(long id) throws NoSuchFolderException;

	public Folder updateImpl(Folder folder);

	/**
	 * Returns the folder with the primary key or throws a <code>NoSuchFolderException</code> if it could not be found.
	 *
	 * @param id the primary key of the folder
	 * @return the folder
	 * @throws NoSuchFolderException if a folder with the primary key could not be found
	 */
	public Folder findByPrimaryKey(long id) throws NoSuchFolderException;

	/**
	 * Returns the folder with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the folder
	 * @return the folder, or <code>null</code> if a folder with the primary key could not be found
	 */
	public Folder fetchByPrimaryKey(long id);

	/**
	 * Returns all the folders.
	 *
	 * @return the folders
	 */
	public java.util.List<Folder> findAll();

	/**
	 * Returns a range of all the folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @return the range of folders
	 */
	public java.util.List<Folder> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of folders
	 */
	@Deprecated
	public java.util.List<Folder> findAll(
		int start, int end, OrderByComparator<Folder> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FolderModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of folders
	 * @param end the upper bound of the range of folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of folders
	 */
	public java.util.List<Folder> findAll(
		int start, int end, OrderByComparator<Folder> orderByComparator);

	/**
	 * Removes all the folders from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of folders.
	 *
	 * @return the number of folders
	 */
	public int countAll();

}