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
 * dsp平台广告位 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("ad_slot")
public class AdSlot implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，广告位id
     */
    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 广告位名称
     */
    private String name;

    /**
     * 广告位描述
     */
    private String description;

    /**
     * 广告类型：1-Banner/图片,2-视频,3-原生广告位，4-激励视频，5-音频广告
     */
    private Integer adType;

    /**
     * 图片/视频宽
     */
    private Integer width;

    /**
     * 图片/视频高
     */
    private Integer height;

    /**
     * 宽高比-宽
     */
    private Integer wratio;

    /**
     * 宽高比->高
     */
    private Integer hratio;

    /**
     * 在使用宽高比匹配广告的时候，限制最小宽度
     */
    private Integer wmin;

    /**
     * 视频广告最小时长
     */
    private Integer minduration;

    /**
     * 视频广告最长时长
     */
    private Integer maxduration;

    /**
     * 原生广告规格
     */
    private Integer nativeAdSpecId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 广告位状态： 0-无效, 1-正常
     */
    private Integer status;

}
