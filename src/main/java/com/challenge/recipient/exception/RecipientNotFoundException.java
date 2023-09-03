package com.challenge.recipient.exception;

public class RecipientNotFoundException extends RuntimeException {

    public RecipientNotFoundException() {
        super();
    }

    public RecipientNotFoundException(String message) {
        super(message);
    }

    public RecipientNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecipientNotFoundException(Throwable cause) {
        super(cause);
    }
}
