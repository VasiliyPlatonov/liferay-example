<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="ru.xdsoft.fips.intranet.portal.filetree.service.FolderLocalServiceUtil" %>
<%@ page import="ru.xdsoft.fips.intranet.portal.filetree.service.FileLocalServiceUtil" %>
<%@ page import="ru.xdsoft.fips.intranet.portal.filetree.model.Folder" %>
<%@ page import="ru.xdsoft.fips.intranet.portal.filetree.model.File" %>
<%@ page import="java.util.List" %>
<%@ include file="../init.jsp" %>

<%--<liferay-ui:search-container emptyResultsMessage="Sorry. There are no record to display."--%>
<%--                             total="<%=FolderLocalServiceUtil.getFoldersCount()%>">--%>

<%--    <liferay-ui:search-container-results--%>
<%--            results="<%= FolderLocalServiceUtil.getFolders(scopeGroupId.longValue())%>"/>--%>

<%--    <liferay-ui:search-container-row--%>
<%--            className="ru.xdsoft.fips.intranet.portal.filetree.model.Folder" modelVar="entry">--%>

<%--        <liferay-ui:icon image="folder.png"></liferay-ui:icon>--%>


<%--        &lt;%&ndash; FILES &ndash;%&gt;--%>

<%--        <liferay-ui:search-container total="<%=FileLocalServiceUtil.getFiles()%>">--%>

<%--            <liferay-ui:search-container-results--%>
<%--                    results="<%= FolderLocalServiceUtil.getFolders(scopeGroupId.longValue())%>"/>--%>

<%--            <liferay-ui:search-container-row--%>
<%--                    className="ru.xdsoft.fips.intranet.portal.filetree.model.Folder" modelVar="entry">--%>

<%--                <liferay-ui:icon image="folder.png"></liferay-ui:icon>--%>


<%--            </liferay-ui:search-container-row>--%>

<%--        </liferay-ui:search-container>--%>

<%--        &lt;%&ndash;   FILES   &ndash;%&gt;--%>


<%--    </liferay-ui:search-container-row>--%>

<%--</liferay-ui:search-container>--%>


<section class="filetree">
    <header class="filetree__header">
        <h1>Папка проектной группы: услуги ВПТБ</h1>
    </header>

        <% List<Folder> folders = FolderLocalServiceUtil.getFolders(scopeGroupId.longValue()); %>
<%--    <c:set var="folders" value="${FolderLocalServiceUtil.getFolders(scopeGroupId.longValue())}" scope="request"/>--%>
    <c:forEach var="folder" items="${pageContext.folders}">
        <%--        <%= folders.get(0) %>--%>
        <c:out default="жопа" value="${folders.get(0).getName()}"/>
        <div class="filetree__folder">
            <ul>
                <li>
                    <div class="filetree__file">

                        <c:set var="files" value="${FileLocalServiceUtil.getFiles(folder.getId())}" scope="request"/>

                        <c:forEach var="file" items="${files}">
                            <c:out value="${3}"/>
                            <%--                                                    <jsp:include page="view.jsp"/>--%>
                        </c:forEach>
                    </div>
                </li>
            </ul>
        </div>
        <%--        <jsp:include page="view.jsp"/>--%>
    </c:forEach>
</section>