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
 * 通用字典表（支持类型和树结构) 实体类。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("sys_dict")
public class SysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 字典类型（如 status, region, user_type等）
     */
    private String dictType;

    /**
     * 字典项键值（如 male, 1, 100000）
     */
    private String dictValue;

    /**
     * 显示值（如 男、启用、北京市）
     */
    private String dictName;

    /**
     * 父字典key（支持树结构）
     */
    private String parentValue;

    /**
     * entry类型： 1-类型,2-字典项
     */
    private Integer entryType;

    /**
     * 排序字段
     */
    private Integer sortOrder;

    /**
     * 状态：1启用，0禁用
     */
    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
