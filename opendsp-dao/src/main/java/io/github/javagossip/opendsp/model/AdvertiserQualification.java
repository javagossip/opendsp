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
 * 广告主资质 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("advertiser_qualification")
public class AdvertiserQualification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资质id
     */
    @Id(keyType = KeyType.Auto)
    private Integer id;

    private Integer advertiserId;

    /**
     * 资质类型
     */
    private Integer qualificationType;

    /**
     * 资质文件url
     */
    private String fileUrl;

}
