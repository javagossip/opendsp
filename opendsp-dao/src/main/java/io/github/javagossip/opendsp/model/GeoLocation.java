package io.github.javagossip.opendsp.model;

import lombok.Data;

@Data
public class GeoLocation {

    private Double lat; //经度
    private Double lon; //纬度
    private int radius; //半径
}
