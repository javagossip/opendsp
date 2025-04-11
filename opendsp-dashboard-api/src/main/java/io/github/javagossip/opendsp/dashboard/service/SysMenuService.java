package io.github.javagossip.opendsp.dashboard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.SysMenuDao;
import io.github.javagossip.opendsp.dashboard.dto.SysMenuDto;
import io.github.javagossip.opendsp.dashboard.factory.SysMenuDtoFactory;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.SysMenu;

import static io.github.javagossip.opendsp.dashboard.constant.Constants.*;

@Service
public class SysMenuService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysMenuService.class);

    @Resource
    private SysMenuDao sysMenuDao;

    public void addOrUpdateMenu(SysMenu menu) {
        LOGGER.info("addOrUpdateMenu:{}", menu);
        Validators.validate(menu);
        sysMenuDao.saveOrUpdate(menu);
    }

    public List<SysMenuDto> listMenus() {
        List<SysMenu> sysMenus = sysMenuDao.list(sysMenuDao.queryChain().eq(SysMenu::getStatus, 1));
        return buildMenuTree0(sysMenus, null);
    }

    private List<SysMenuDto> buildMenuTree0(List<SysMenu> sysMenus, Integer parentId) {
        List<SysMenuDto> menuTree = new ArrayList<>();
        for (SysMenu sysMenu : sysMenus) {
            SysMenuDto sysMenuDto = SysMenuDtoFactory.withSysMenu(sysMenu);
            if (Objects.equals(sysMenu.getParentId(), parentId)) {
                sysMenuDto.setChildren(buildMenuTree0(sysMenus, sysMenu.getId()));
                menuTree.add(sysMenuDto);
            }
        }
        return menuTree;
    }

    public void hideMenu(Integer menuId) {
        Preconditions.checkNotNull(menuId, ErrorMessages.MENU_ID_IS_NULL);
        LOGGER.info("hideMenu:{}", menuId);
        sysMenuDao.updateById(SysMenu.builder().id(menuId).visible(0).build());
    }

    public void deleteMenu(Integer menuId) {
        Preconditions.checkNotNull(menuId, ErrorMessages.MENU_ID_IS_NULL);
        LOGGER.info("deleteMenu:{}", menuId);
        boolean hasSubMenus = sysMenuDao.exists(sysMenuDao.queryChain().eq(SysMenu::getParentId, menuId));
        if (hasSubMenus) {
            throw new BizException(ErrorMessages.MENU_HAS_SUB_MENUS);
        }
        sysMenuDao.removeById(menuId);
    }

    public void disableMenu(Integer menuId) {
        Preconditions.checkNotNull(menuId, ErrorMessages.MENU_ID_IS_NULL);
        LOGGER.info("disableMenu:{}", menuId);
        sysMenuDao.updateById(SysMenu.builder().id(menuId).status(0).build());
    }

    public void enableMenu(Integer menuId) {
        Preconditions.checkNotNull(menuId, ErrorMessages.MENU_ID_IS_NULL);
        LOGGER.info("enableMenu:{}", menuId);
        sysMenuDao.updateById(SysMenu.builder().id(menuId).status(1).build());
    }

    public List<SysMenuDto> listUserMenus(Integer userId) {
        LOGGER.info("listUserMenus:{}", userId);
        List<SysMenu> sysMenus = sysMenuDao.selectMenusByUserId(userId);
        return buildMenuTree0(sysMenus, null);
    }
}
