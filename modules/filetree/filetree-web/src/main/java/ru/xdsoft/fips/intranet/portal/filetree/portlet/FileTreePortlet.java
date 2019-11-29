package ru.xdsoft.fips.intranet.portal.filetree.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.w3c.dom.ls.LSOutput;
import ru.xdsoft.fips.intranet.portal.filetree.constants.FileTreePortletKeys;
import ru.xdsoft.fips.intranet.portal.filetree.model.File;
import ru.xdsoft.fips.intranet.portal.filetree.model.Folder;
import ru.xdsoft.fips.intranet.portal.filetree.service.FileLocalService;
import ru.xdsoft.fips.intranet.portal.filetree.service.FolderLocalService;


import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Vasiliy Platonov
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=FileTree",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/filetree/view.jsp",
                "javax.portlet.name=" + FileTreePortletKeys.FILETREE,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class FileTreePortlet extends MVCPortlet {

    @Reference
    private FolderLocalService _folderLocalService;

    @Reference
    private FileLocalService _fileLocalService;

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws IOException, PortletException {

        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(
                    Folder.class.getName(), renderRequest);

            long groupId = serviceContext.getScopeGroupId();

            List<Folder> folders = _folderLocalService.getFolders(groupId);

            if (folders.isEmpty()) {
                Folder folder = _folderLocalService.addFolder("Группа №5478", 0,
                        serviceContext.getUserId(), serviceContext);

                _fileLocalService.addFile("Проект решений", "some url1", "txt",
                        folder.getId(), serviceContext.getUserId(), serviceContext);

                _fileLocalService.addFile("Заявки", "some url2", "txt",
                        folder.getId(), serviceContext.getUserId(), serviceContext);

                _fileLocalService.addFile("Ответы на запросы", "some url3", "txt",
                        folder.getId(), serviceContext.getUserId(), serviceContext);

                showTestInfo(folder.getId(), serviceContext, "было пусто");
            } else {
                showTestInfo(folders.get(0).getId(), serviceContext, "было пусто");
            }

        } catch (PortalException e) {
            e.printStackTrace();
        }

        super.render(renderRequest, renderResponse);
    }

    private void showTestInfo(long folderId, ServiceContext serviceContext, String msg) {
        long scopeGroupId = serviceContext.getScopeGroupId();
        List<Folder> folders = _folderLocalService.getFolders(scopeGroupId);

        System.out.println(msg);
        System.out.println("groupId: " + scopeGroupId);
        System.out.println("All Folders: " + folders);
        System.out.println("All Files: ");
        _fileLocalService.getFiles(folderId).forEach(System.out::println);
    }


}