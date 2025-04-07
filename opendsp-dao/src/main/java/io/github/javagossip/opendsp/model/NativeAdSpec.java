package io.github.javagossip.opendsp.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 原生广告规格定义 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("native_ad_spec")
public class NativeAdSpec implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    private Integer adSlotId;

    /**
     * 广告组件类型: 1-文本,2-图片,3-视频
     */
    private Integer assetType;

    /**
     * 名称，比如：主图、logo、描述等
     */
    private String assetName;

    /**
     * 英文名
     */
    private String assetKey;

    /**
     * 图片组件宽
     */
    private Integer width;

    /**
     * 图片组件高
     */
    private Integer height;

    /**
     * 文本组件长度限制
     */
    private Integer len;

    /**
     * 视频组件最小时长
     */
    private Integer minduration;

    /**
     * 视频组件最长时长
     */
    private Integer maxduration;

    /**
     * 支持媒体类型
     */
    private String mimes;

    /**
     * 是否必填
     */
    private Boolean required;

}
