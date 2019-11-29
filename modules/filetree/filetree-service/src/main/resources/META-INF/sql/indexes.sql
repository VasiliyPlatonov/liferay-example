create index IX_1B1CC370 on FT_File (groupId, parentId);
create index IX_ED1E9472 on FT_File (name[$COLUMN_LENGTH:75$]);
create index IX_C2F8184C on FT_File (parentId);
create index IX_76565227 on FT_File (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F5CB3669 on FT_File (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BAA49D25 on FT_Folder (groupId);
create index IX_69497124 on FT_Folder (name[$COLUMN_LENGTH:75$]);
create index IX_7431B3D9 on FT_Folder (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D6175C9B on FT_Folder (uuid_[$COLUMN_LENGTH:75$], groupId);