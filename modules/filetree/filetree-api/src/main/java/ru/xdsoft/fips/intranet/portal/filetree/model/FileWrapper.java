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

package ru.xdsoft.fips.intranet.portal.filetree.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link File}.
 * </p>
 *
 * @author Vasiliy Platonov
 * @see File
 * @generated
 */
@ProviderType
public class FileWrapper
	extends BaseModelWrapper<File> implements File, ModelWrapper<File> {

	public FileWrapper(File file) {
		super(file);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("parentId", getParentId());
		attributes.put("url", getUrl());
		attributes.put("resourceType", getResourceType());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String resourceType = (String)attributes.get("resourceType");

		if (resourceType != null) {
			setResourceType(resourceType);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	/**
	 * Returns the company ID of this file.
	 *
	 * @return the company ID of this file
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the group ID of this file.
	 *
	 * @return the group ID of this file
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this file.
	 *
	 * @return the ID of this file
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this file.
	 *
	 * @return the name of this file
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the parent ID of this file.
	 *
	 * @return the parent ID of this file
	 */
	@Override
	public long getParentId() {
		return model.getParentId();
	}

	/**
	 * Returns the primary key of this file.
	 *
	 * @return the primary key of this file
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the resource type of this file.
	 *
	 * @return the resource type of this file
	 */
	@Override
	public String getResourceType() {
		return model.getResourceType();
	}

	/**
	 * Returns the url of this file.
	 *
	 * @return the url of this file
	 */
	@Override
	public String getUrl() {
		return model.getUrl();
	}

	/**
	 * Returns the uuid of this file.
	 *
	 * @return the uuid of this file
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this file.
	 *
	 * @param companyId the company ID of this file
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the group ID of this file.
	 *
	 * @param groupId the group ID of this file
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this file.
	 *
	 * @param id the ID of this file
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this file.
	 *
	 * @param name the name of this file
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the parent ID of this file.
	 *
	 * @param parentId the parent ID of this file
	 */
	@Override
	public void setParentId(long parentId) {
		model.setParentId(parentId);
	}

	/**
	 * Sets the primary key of this file.
	 *
	 * @param primaryKey the primary key of this file
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the resource type of this file.
	 *
	 * @param resourceType the resource type of this file
	 */
	@Override
	public void setResourceType(String resourceType) {
		model.setResourceType(resourceType);
	}

	/**
	 * Sets the url of this file.
	 *
	 * @param url the url of this file
	 */
	@Override
	public void setUrl(String url) {
		model.setUrl(url);
	}

	/**
	 * Sets the uuid of this file.
	 *
	 * @param uuid the uuid of this file
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected FileWrapper wrap(File file) {
		return new FileWrapper(file);
	}

}