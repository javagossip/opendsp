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
 * 广告组-广告投放策略设置 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("ad_group")
public class AdGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 广告组名称
     */
    private String name;

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
    private Integer timeIntervals;

    /**
     * 每日投放预算
     */
    private Integer dailyBudget;

    /**
     * 出价方式： 1-CPM,2-CPC,3-CPA,4-oCPM,5-oCPC
     */
    private Integer bidMode;

    /**
     * 广告出价，单位: 分
     */
    private Integer bidPrice;

    /**
     * 安卓应用包名或者ios应用id
     */
    private String bundle;

    /**
     * 落地页地址
     */
    private String landingUrl;

    /**
     * 推广类型
     */
    private Integer promotionType;

    /**
     * 频次控制, 格式：{"period":"day","freq":3}
     */
    private String freqCapping;

    /**
     * 私有竞价标识，包括PDB,PD,PA
     */
    private Integer dealid;

    /**
     * adx定向
     */
    private String targetAdx;

    /**
     * 年龄定向, 年龄段枚举
     */
    private Integer targetAge;

    /**
     * 性别定向，性别枚举
     */
    private Integer targetGender;

    /**
     * 地域定向，地域包id
     */
    private Integer targetArea;

    /**
     * 地理位置定向
     */
    private Integer targetGeoLocation;

    /**
     * 商圈定向，商圈id
     */
    private Integer targetBusinessDistrict;

    /**
     * 操作系统定向，操作系统枚举
     */
    private Integer targetOs;

    /**
     * 设备定向
     */
    private Integer targetDeviceType;

    /**
     * 定向设备品牌， 品牌枚举
     */
    private Integer targetDeviceBrand;

    private Integer targetDeviceModel;

    /**
     * 网络定向: wifi,2G,3G,4G,5G
     */
    private Integer targetNetworkType;

    /**
     * 指定设备定向, 广告验证使用
     */
    private String targetDevice;

    /**
     * 人群定向, 人群包id
     */
    private Integer targetCustomAudience;

    /**
     * 曝光监测地址
     */
    private String impTrackingUrls;

    /**
     * 点击监测地址
     */
    private String clickTrackingUrls;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createUser;

    private String updateUser;

    /**
     * 广告组状态
     */
    private Integer status;

}
