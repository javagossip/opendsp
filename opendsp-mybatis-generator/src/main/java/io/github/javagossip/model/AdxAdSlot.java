package io.github.javagossip.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 广告位-adx关联表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("adx_ad_slot")
public class AdxAdSlot implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dsp平台广告位id
     */
    @Id(keyType = KeyType.Auto)
    private Long adSlotId;

    /**
     * adx广告位id
     */
    private Integer adxAdSlotId;

    /**
     * adx广告位名称
     */
    private String adxAdSlotName;

    /**
     * adx标识
     */
    private String adxId;

    /**
     * adx广告位预估ctr
     */
    private Double estimatedCtr;

    /**
     * 预估广告位请求量
     */
    private Integer estimatedRequests;

    /**
     * 广告位截图
     */
    private String screenshot;

}
