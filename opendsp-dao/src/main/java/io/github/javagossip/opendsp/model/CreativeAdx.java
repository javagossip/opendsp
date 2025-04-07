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
 * 广告创意-adx平台关联表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("creative_adx")
public class CreativeAdx implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 创意id
     */
    private Integer creativeId;

    /**
     * adx创意id
     */
    private String adxCreativeId;

    /**
     * adx审核状态
     */
    private Integer auditStatus;

    /**
     * 审核批注
     */
    private String auditComments;

    /**
     * adx唯一标识符
     */
    private String adxId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
