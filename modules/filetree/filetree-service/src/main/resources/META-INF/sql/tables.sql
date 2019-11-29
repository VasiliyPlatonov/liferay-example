create table FT_File (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	parentId LONG,
	url VARCHAR(75) null,
	resourceType VARCHAR(75) null,
	groupId LONG,
	companyId LONG
);

create table FT_Folder (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	parentId LONG,
	groupId LONG,
	companyId LONG
);