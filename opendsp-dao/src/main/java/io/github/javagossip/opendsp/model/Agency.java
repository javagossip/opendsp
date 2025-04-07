package io.github.javagossip.opendsp.model;

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
 * 代理商信息 实体类。
 *
 * @author weiping wang
 * @since 2025-04-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("agency")
public class Agency implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，广告主id
     */
    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 广告主登录密码
     */
    private String password;

    /**
     * 代理商对应的用户id
     */
    private Integer sysUserId;

    /**
     * 营业执照上名称
     */
    private String companyName;

    /**
     * 省
     */
    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区县
     */
    private Integer county;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邮件
     */
    private String email;

    /**
     * 企业网址
     */
    private String siteUrl;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 创建人信息，格式： 用户id:用户名称
     */
    private String createUser;

    /**
     * 更新人信息
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 状态：0-禁用,1-正常,2-余额不足
     */
    private Integer status;

}
