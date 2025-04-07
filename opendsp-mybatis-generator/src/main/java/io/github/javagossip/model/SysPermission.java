package io.github.javagossip.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统权限表（支持菜单/按钮/API） 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("sys_permission")
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限唯一标识
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 权限名称（如：用户管理）
     */
    private String name;

    /**
     * 父权限ID（0表示根节点）
     */
    private Long parentId;

    /**
     * 权限类型（1=菜单 2=按钮 3=API）
     */
    private Integer type;

    /**
     * 权限标识（如 user:add, GET:/api/users）
     */
    private String permissionKey;

    /**
     * 前端组件路径（Vue/React组件）
     */
    private String componentPath;

    /**
     * 菜单图标名称
     */
    private String icon;

    /**
     * 前端路由路径
     */
    private String routePath;

    /**
     * 排序序号（越小越靠前）
     */
    private Integer sortOrder;

    /**
     * 状态（0=禁用 1=启用）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;

}
