package com.thoughtworks;

public abstract class BaseHandler {

    private BaseHandler nextHandler;

    public abstract String getResult(int number);

    public final BaseHandler getNextHandler() {
        return nextHandler;
    }

    public final void setNextHandler(final BaseHandler handler) {
        this.nextHandler = handler;
    }
}
