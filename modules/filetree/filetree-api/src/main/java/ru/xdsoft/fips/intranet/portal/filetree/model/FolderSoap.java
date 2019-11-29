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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link ru.xdsoft.fips.intranet.portal.filetree.service.http.FolderServiceSoap}.
 *
 * @author Vasiliy Platonov
 * @generated
 */
@ProviderType
public class FolderSoap implements Serializable {

	public static FolderSoap toSoapModel(Folder model) {
		FolderSoap soapModel = new FolderSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setParentId(model.getParentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static FolderSoap[] toSoapModels(Folder[] models) {
		FolderSoap[] soapModels = new FolderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FolderSoap[][] toSoapModels(Folder[][] models) {
		FolderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FolderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FolderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FolderSoap[] toSoapModels(List<Folder> models) {
		List<FolderSoap> soapModels = new ArrayList<FolderSoap>(models.size());

		for (Folder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FolderSoap[soapModels.size()]);
	}

	public FolderSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getParentId() {
		return _parentId;
	}

	public void setParentId(long parentId) {
		_parentId = parentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	private String _uuid;
	private long _id;
	private String _name;
	private long _parentId;
	private long _groupId;
	private long _companyId;

}