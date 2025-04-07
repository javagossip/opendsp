package io.github.javagossip.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色权限关联表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("sys_role_permission")
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @Id
    private Integer roleId;

    /**
     * 权限id
     */
    @Id
    private Integer permissionId;

}
