package io.github.javagossip.opendsp.core.exception;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_ERROR_CODE = 500;

    private int code = DEFAULT_ERROR_CODE;

    public BizException(String message) {
        super(message);
    }

    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return code;
    }
}
