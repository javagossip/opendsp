package io.github.javagossip.opendsp.adx.model;

public class AuditResult {

    private AuditStatus status;
    private String message;

    enum AuditStatus {
        SUCCESS,
        FAIL
    }
}
