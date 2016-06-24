package com.thoughtworks;

public class Student {
    private BaseHandler handler;

    public final void setHandler(final BaseHandler baseHandler) {
        this.handler = baseHandler;
    }

    public final String answer(final int number) {
        if (handler != null) {
            return handler.getResult(number);
        }
        return String.valueOf(number);
    }
}
