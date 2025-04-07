package io.github.javagossip.opendsp.model.support;

import lombok.Data;

@Data
public abstract class PageQuery {

    private int page;
    private int size;
}
