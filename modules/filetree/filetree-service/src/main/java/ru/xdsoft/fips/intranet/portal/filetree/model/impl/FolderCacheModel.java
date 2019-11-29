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

package ru.xdsoft.fips.intranet.portal.filetree.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

import ru.xdsoft.fips.intranet.portal.filetree.model.Folder;

/**
 * The cache model class for representing Folder in entity cache.
 *
 * @author Vasiliy Platonov
 * @generated
 */
@ProviderType
public class FolderCacheModel implements CacheModel<Folder>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FolderCacheModel)) {
			return false;
		}

		FolderCacheModel folderCacheModel = (FolderCacheModel)obj;

		if (id == folderCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Folder toEntityModel() {
		FolderImpl folderImpl = new FolderImpl();

		if (uuid == null) {
			folderImpl.setUuid("");
		}
		else {
			folderImpl.setUuid(uuid);
		}

		folderImpl.setId(id);

		if (name == null) {
			folderImpl.setName("");
		}
		else {
			folderImpl.setName(name);
		}

		folderImpl.setParentId(parentId);
		folderImpl.setGroupId(groupId);
		folderImpl.setCompanyId(companyId);

		folderImpl.resetOriginalValues();

		return folderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		name = objectInput.readUTF();

		parentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(parentId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
	}

	public String uuid;
	public long id;
	public String name;
	public long parentId;
	public long groupId;
	public long companyId;

}