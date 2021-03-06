// Copyright 2020 ALO7 Inc. All rights reserved.

package com.internet.kael.ioc.exception;

/**
 * @author Kael He(kael.he@alo7.com)
 * @since 1.0
 */
public class IocRuntimeException extends RuntimeException {
    public IocRuntimeException() {
    }

    public IocRuntimeException(String message) {
        super(message);
    }

    public IocRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IocRuntimeException(Throwable cause) {
        super(cause);
    }

    public IocRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
