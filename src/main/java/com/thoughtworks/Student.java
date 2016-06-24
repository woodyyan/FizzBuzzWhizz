package com.thoughtworks;

public class Student {
    private BaseHandler handler;

    public void setHandler(BaseHandler handler) {
        this.handler = handler;
    }

    public String answer(int number) {
        if (handler != null) {
            return handler.getResult(number);
        }
        return String.valueOf(number);
    }
}
