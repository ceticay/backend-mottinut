package com.mottinut.shared.domain.exceptions;

public class NotFoundException extends BusinessException {
    public NotFoundException(String message) {
        super(message);
    }
}