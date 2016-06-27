package com.thoughtworks;

public abstract class BaseHandler {

    private BaseHandler nextHandler;

    public abstract String getResult(int number);

    public final BaseHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseHandler handler) {
        this.nextHandler = handler;
    }
}
