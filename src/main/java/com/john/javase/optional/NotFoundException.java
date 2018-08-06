package com.john.javase.optional;

import java.util.function.Supplier;

public class NotFoundException implements Supplier<RuntimeException> {

    private String msg;

    public NotFoundException() {
    }
    public NotFoundException(String msg) {
        this.msg = msg;
    }

    @Override
    public RuntimeException get() {
        return new RuntimeException(msg);
    }
}
