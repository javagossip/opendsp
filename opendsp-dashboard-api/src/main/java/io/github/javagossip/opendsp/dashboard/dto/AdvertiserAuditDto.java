package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdvertiserAuditDto {

    private Integer id;
    private Integer auditStatus;
    private String auditComments;
}
