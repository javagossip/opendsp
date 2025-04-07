package io.github.javagossip.model;

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
 * 推广计划 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("campaign")
public class Campaign implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 推广计划名称
     */
    private Integer name;

    /**
     * 广告主id
     */
    private Integer advertiserId;

    /**
     * 每日预算
     */
    private Integer dailyBudget;

    /**
     * 推广开始时间
     */
    private LocalDateTime startTime;

    /**
     * 推广结束时间
     */
    private LocalDateTime endTime;

    /**
     * 投放方式： 1-正常投放,2-匀速投放
     */
    private Integer deliveryMode;

    /**
     * 推广类型
     */
    private Integer promotionType;

    /**
     * 默认曝光监测地址，下层广告组如果设置了会覆盖这个配置
     */
    private String impTrackingUrl;

    /**
     * 默认点击监测地址，下层设置会覆盖
     */
    private String clickTrackingUrl;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 格式： 用户id:用户名称
     */
    private String createUser;

    /**
     * 同create_user字段
     */
    private String updateUser;

    /**
     * 推广计划状态： 0-无效,1-正常,2-预算超限
     */
    private Integer status;

}
