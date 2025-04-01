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
 *  实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("ad_stat")
public class AdStat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 创意id
     */
    private Integer creativeId;

    /**
     * 广告位id
     */
    private Integer adSlotId;

    /**
     * 广告组id
     */
    private Integer adGroupId;

    /**
     * 推广计划id
     */
    private Integer campaignId;

    /**
     * 广告主id
     */
    private Integer advertiserId;

    /**
     * 统计日，格式yyyyMMdd
     */
    private Integer statDay;

    /**
     * 统计小时
     */
    private Integer statHour;

    /**
     * 曝光数
     */
    private Integer impressions;

    /**
     * 点击数
     */
    private Integer clicks;

    /**
     * 参与竞价数
     */
    private Integer bids;

    /**
     * 竞价获胜数
     */
    private Integer wins;

    /**
     * 转化数
     */
    private Integer conversions;

    /**
     * 成本/花费-面向广告主
     */
    private Long cost;

}
