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
 * 广告创意 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("creative")
public class Creative implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 广告组id
     */
    private Integer adGroupId;

    /**
     * 广告位id
     */
    private Integer adSlotId;

    /**
     * 创意名称
     */
    private String creativeName;

    /**
     * 创意url, 图片或视频广告素材地址
     */
    private String creativeUrl;

    /**
     * 原生广告内容
     */
    private String nativeAdContent;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 更新日期
     */
    private LocalDateTime updateTime;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 更新用户
     */
    private String updateUser;

    /**
     * 广告创意状态
     */
    private Integer status;

}
