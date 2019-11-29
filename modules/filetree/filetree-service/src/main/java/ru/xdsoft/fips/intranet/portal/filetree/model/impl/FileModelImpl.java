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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

import ru.xdsoft.fips.intranet.portal.filetree.model.File;
import ru.xdsoft.fips.intranet.portal.filetree.model.FileModel;
import ru.xdsoft.fips.intranet.portal.filetree.model.FileSoap;

/**
 * The base model implementation for the File service. Represents a row in the &quot;FT_File&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>FileModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FileImpl}.
 * </p>
 *
 * @author Vasiliy Platonov
 * @see FileImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class FileModelImpl extends BaseModelImpl<File> implements FileModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a file model instance should use the <code>File</code> interface instead.
	 */
	public static final String TABLE_NAME = "FT_File";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"name", Types.VARCHAR}, {"parentId", Types.BIGINT},
		{"url", Types.VARCHAR}, {"resourceType", Types.VARCHAR},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("parentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("resourceType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table FT_File (uuid_ VARCHAR(75) null,id_ LONG not null primary key,name VARCHAR(75) null,parentId LONG,url VARCHAR(75) null,resourceType VARCHAR(75) null,groupId LONG,companyId LONG)";

	public static final String TABLE_SQL_DROP = "drop table FT_File";

	public static final String ORDER_BY_JPQL = " ORDER BY file.name ASC";

	public static final String ORDER_BY_SQL = " ORDER BY FT_File.name ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long NAME_COLUMN_BITMASK = 4L;

	public static final long PARENTID_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static File toModel(FileSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		File model = new FileImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setName(soapModel.getName());
		model.setParentId(soapModel.getParentId());
		model.setUrl(soapModel.getUrl());
		model.setResourceType(soapModel.getResourceType());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<File> toModels(FileSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<File> models = new ArrayList<File>(soapModels.length);

		for (FileSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public FileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return File.class;
	}

	@Override
	public String getModelClassName() {
		return File.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<File, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<File, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<File, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((File)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<File, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<File, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((File)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<File, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<File, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, File>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			File.class.getClassLoader(), File.class, ModelWrapper.class);

		try {
			Constructor<File> constructor =
				(Constructor<File>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<File, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<File, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<File, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<File, Object>>();
		Map<String, BiConsumer<File, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<File, ?>>();

		attributeGetterFunctions.put("uuid", File::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<File, String>)File::setUuid);
		attributeGetterFunctions.put("id", File::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<File, Long>)File::setId);
		attributeGetterFunctions.put("name", File::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<File, String>)File::setName);
		attributeGetterFunctions.put("parentId", File::getParentId);
		attributeSetterBiConsumers.put(
			"parentId", (BiConsumer<File, Long>)File::setParentId);
		attributeGetterFunctions.put("url", File::getUrl);
		attributeSetterBiConsumers.put(
			"url", (BiConsumer<File, String>)File::setUrl);
		attributeGetterFunctions.put("resourceType", File::getResourceType);
		attributeSetterBiConsumers.put(
			"resourceType", (BiConsumer<File, String>)File::setResourceType);
		attributeGetterFunctions.put("groupId", File::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<File, Long>)File::setGroupId);
		attributeGetterFunctions.put("companyId", File::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<File, Long>)File::setCompanyId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_columnBitmask |= PARENTID_COLUMN_BITMASK;

		if (!_setOriginalParentId) {
			_setOriginalParentId = true;

			_originalParentId = _parentId;
		}

		_parentId = parentId;
	}

	public long getOriginalParentId() {
		return _originalParentId;
	}

	@JSON
	@Override
	public String getUrl() {
		if (_url == null) {
			return "";
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@JSON
	@Override
	public String getResourceType() {
		if (_resourceType == null) {
			return "";
		}
		else {
			return _resourceType;
		}
	}

	@Override
	public void setResourceType(String resourceType) {
		_resourceType = resourceType;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), File.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public File toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, File>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FileImpl fileImpl = new FileImpl();

		fileImpl.setUuid(getUuid());
		fileImpl.setId(getId());
		fileImpl.setName(getName());
		fileImpl.setParentId(getParentId());
		fileImpl.setUrl(getUrl());
		fileImpl.setResourceType(getResourceType());
		fileImpl.setGroupId(getGroupId());
		fileImpl.setCompanyId(getCompanyId());

		fileImpl.resetOriginalValues();

		return fileImpl;
	}

	@Override
	public int compareTo(File file) {
		int value = 0;

		value = getName().compareTo(file.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof File)) {
			return false;
		}

		File file = (File)obj;

		long primaryKey = file.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		FileModelImpl fileModelImpl = this;

		fileModelImpl._originalUuid = fileModelImpl._uuid;

		fileModelImpl._originalName = fileModelImpl._name;

		fileModelImpl._originalParentId = fileModelImpl._parentId;

		fileModelImpl._setOriginalParentId = false;

		fileModelImpl._originalGroupId = fileModelImpl._groupId;

		fileModelImpl._setOriginalGroupId = false;

		fileModelImpl._originalCompanyId = fileModelImpl._companyId;

		fileModelImpl._setOriginalCompanyId = false;

		fileModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<File> toCacheModel() {
		FileCacheModel fileCacheModel = new FileCacheModel();

		fileCacheModel.uuid = getUuid();

		String uuid = fileCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			fileCacheModel.uuid = null;
		}

		fileCacheModel.id = getId();

		fileCacheModel.name = getName();

		String name = fileCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			fileCacheModel.name = null;
		}

		fileCacheModel.parentId = getParentId();

		fileCacheModel.url = getUrl();

		String url = fileCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			fileCacheModel.url = null;
		}

		fileCacheModel.resourceType = getResourceType();

		String resourceType = fileCacheModel.resourceType;

		if ((resourceType != null) && (resourceType.length() == 0)) {
			fileCacheModel.resourceType = null;
		}

		fileCacheModel.groupId = getGroupId();

		fileCacheModel.companyId = getCompanyId();

		return fileCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<File, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<File, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<File, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((File)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<File, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<File, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<File, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((File)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, File>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _id;
	private String _name;
	private String _originalName;
	private long _parentId;
	private long _originalParentId;
	private boolean _setOriginalParentId;
	private String _url;
	private String _resourceType;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _columnBitmask;
	private File _escapedModel;

}