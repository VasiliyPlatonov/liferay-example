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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the File service. Represents a row in the &quot;FT_File&quot; database table, with each column mapped to a property of this class.
 *
 * @author Vasiliy Platonov
 * @see FileModel
 * @generated
 */
@ImplementationClassName(
	"ru.xdsoft.fips.intranet.portal.filetree.model.impl.FileImpl"
)
@ProviderType
public interface File extends FileModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>ru.xdsoft.fips.intranet.portal.filetree.model.impl.FileImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<File, Long> ID_ACCESSOR =
		new Accessor<File, Long>() {

			@Override
			public Long get(File file) {
				return file.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<File> getTypeClass() {
				return File.class;
			}

		};

}