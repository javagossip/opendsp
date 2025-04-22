package io.github.javagossip.opendsp.model;

import lombok.Data;

@Data
public class FreqCapping {

    private Integer frequency;
    //频次控制时间窗口，1-day,2-week,3-month
    private Integer timeWindow;
}
