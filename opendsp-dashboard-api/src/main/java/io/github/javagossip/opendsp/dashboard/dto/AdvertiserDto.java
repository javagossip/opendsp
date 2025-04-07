package io.github.javagossip.opendsp.dashboard.dto;

import java.util.List;

import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.AdvertiserAdx;
import io.github.javagossip.opendsp.model.AdvertiserQualification;
import lombok.Data;

@Data
public class AdvertiserDto {

    private Advertiser advertiser;
    private List<AdvertiserQualification> qualifications;
    private List<AdvertiserAdx> advertiserAdxs;
}
