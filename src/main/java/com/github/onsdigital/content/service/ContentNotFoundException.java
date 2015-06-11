package com.github.onsdigital.content.service;

/**
 * Created by bren on 10/06/15.
 *
 */
public class ContentNotFoundException extends  Exception {

    public ContentNotFoundException() {
    }

    public ContentNotFoundException(String message) {
        super(message);
    }

    public ContentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContentNotFoundException(Throwable cause) {
        super(cause);
    }

    public ContentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
