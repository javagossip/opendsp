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
 *  实体类。
 *
 * @author weiping wang
 * @since 2025-04-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("creative_stats")
public class CreativeStats implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 创意id
     */
    private Integer creativeId;

    /**
     * 广告主id
     */
    private Integer advertiserId;

    /**
     * 推广计划id
     */
    private Integer campaignId;

    /**
     * 广告组id
     */
    private Integer adGroupId;

    /**
     * 广告位id
     */
    private Integer adSlotId;

    /**
     * 统计日期，格式yyyyMMdd
     */
    private String statDate;

    /**
     * 统计小时
     */
    private Integer statHour;

    /**
     * 参与竞价数
     */
    private Integer bids;

    /**
     * 竞价获胜数
     */
    private Integer wins;

    /**
     * 曝光数
     */
    private Integer impressions;

    /**
     * 点击数
     */
    private Integer clicks;

    /**
     * 转化数
     */
    private Integer conversions;

    /**
     * 成本/花费-面向广告主
     */
    private Long cost;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 更新日期
     */
    private LocalDateTime updateTime;

}
