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
 * 广告主充值记录表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("advertiser_recharge")
public class AdvertiserRecharge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 广告主id
     */
    private Integer advertiserId;

    /**
     * 充值日期
     */
    private LocalDateTime createTime;

    /**
     * 充值类型： 1-充值，2-提现/退款
     */
    private Integer type;

    /**
     * 充值金额， 充值金额为正，退款为负
     */
    private Integer amount;

}
