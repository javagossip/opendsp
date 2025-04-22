package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;

@Data
public class DictTypeDto {

    private Integer id;
    private String name; //字典类型名称，如gender, industry
    private String value; //字典类型中文名，如性别, 行业
}
