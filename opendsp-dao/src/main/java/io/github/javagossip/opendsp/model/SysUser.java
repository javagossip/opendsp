package io.github.javagossip.opendsp.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统用户表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户类型，1-广告主; 2-代理商；3-普通用户，4-管理员
     */
    private Integer type;

    /**
     * 登录密码，加密保存
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 用户状态，1-有效;0-无效
     */
    private Integer status;

}
