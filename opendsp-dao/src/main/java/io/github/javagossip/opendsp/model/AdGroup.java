package io.github.javagossip.opendsp.model;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.handler.Fastjson2TypeHandler;
import io.github.javagossip.opendsp.model.FreqCapping;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.type.JdbcType;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 广告组-广告投放策略设置 实体类。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("ad_group")
public class AdGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 广告组名称
     */
    private String name;

    /**
     * 活动id
     */
    private Integer campaignId;

    /**
     * 广告主id
     */
    private Integer advertiserId;

    /**
     * 广告位id
     */
    private Integer adSlotId;

    /**
     * 投放开始日期
     */
    private LocalDateTime beginDate;

    /**
     * 投放结束日期
     */
    private LocalDateTime endDate;

    /**
     * 投放时间段
     */
    private String timeSlots;

    /**
     * 每日投放预算,单位元
     */
    private Integer budget;

    /**
     * 投放模式：匀速 or 正常
     */
    private Integer deliveryMode;

    /**
     * 出价方式： 1-CPM,2-CPC,3-CPA,4-oCPM,5-oCPC
     */
    private Integer biddingMethod;

    /**
     * 广告出价，单位: 分
     */
    private Integer bidPrice;

    /**
     * 落地页地址
     */
    private String landingUrl;

    /**
     * 推广应用的appid or bundle
     */
    private String bundle;

    /**
     * 推广类型, 参见sys_dict表中的dict_type为promotion_type的字典项
     */
    private Integer promotionType;

    /**
     * 频次控制, 格式：{"period":"day","freq":3}
     */
    @Column(jdbcType = JdbcType.VARCHAR, typeHandler = Fastjson2TypeHandler.class)
    private FreqCapping freqCapping;

    /**
     * 私有竞价标识，包括PDB,PD,PA
     */
    private String dealId;

    /**
     * 定向交易平台，比如定向爱奇艺
     */
    private String targetAdx;

    /**
     * 媒体定向，多个媒体id按逗号分隔
     */
    private String targetMedia;

    /**
     * 地域定向，多个逗号分隔
     */
    private String targetRegion;

    /**
     * 地理位置定向，json数组格式
     */
    @Column(jdbcType = JdbcType.VARCHAR, typeHandler = Fastjson2TypeHandler.class)
    private List<GeoLocation> targetGeoLocation;

    /**
     * 操作系统定向，多个逗号分隔，操作系统枚举
     */
    private String targetOs;

    /**
     * 电信运营商定向，多个逗号分隔
     */
    private String targetCarrier;

    /**
     * 设备定向，多个逗号分隔
     */
    private String targetDeviceType;

    /**
     * 定向设备生产商， 品牌枚举
     */
    private String targetDeviceMake;

    /**
     * 定向设备型号
     */
    private String targetDeviceModel;

    /**
     * 网络定向: wifi,2G,3G,4G,5G
     */
    private String targetConnectionType;

    /**
     * 曝光监测地址
     */
    private String impTrackingUrls;

    /**
     * 点击监测地址
     */
    private String clickTrackingUrls;

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
     * 广告组状态
     */
    private Integer status;

}
