package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;

@Data
public class DictItemDto {

    private String dictType;
    private String key;
    private String value;
    private String parentKey;
}
