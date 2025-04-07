package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdGroupQueryDto {

    //广告主id
    private Long advertiserId;
    //推广计划id
    private Long campaignId;
    //广告组名称
    private String name;
    //广告组状态
    private Integer status;

    private Integer page;
    private Integer size;
}
