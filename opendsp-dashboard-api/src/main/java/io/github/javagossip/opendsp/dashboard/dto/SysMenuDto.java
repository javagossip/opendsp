package io.github.javagossip.opendsp.dashboard.dto;

import java.util.List;

import lombok.Data;

@Data
public class SysMenuDto {

    private Integer id;
    private Integer parentId;
    private String name;
    private String path;
    private String component;
    private String icon;
    private String permission;
    private String remark;

    private List<SysMenuDto> children;
}
