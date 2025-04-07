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
 * 系统字典表 实体类。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("sys_dict")
public class SysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id(keyType = KeyType.Auto)
    private Integer dictId;

    /**
     * 字典值
     */
    private String dictValue;

    /**
     * 字典键值
     */
    private String dictKey;

    /**
     * 字典组id
     */
    private Integer dictGroup;

    /**
     * 字典类型
     */
    private Integer dictType;

    /**
     * 字典对应枚举值
     */
    private Integer enumValue;

    /**
     * 状态： 0 无效  1 有效
     */
    private Integer status;

    /**
     * 逻辑删除
     */
    private Boolean deleted;

}
