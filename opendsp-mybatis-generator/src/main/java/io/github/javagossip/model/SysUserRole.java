package io.github.javagossip.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户角色关联表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("sys_user_role")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @Id
    private Integer userId;

    /**
     * 角色id
     */
    @Id
    private Integer roleId;

}
