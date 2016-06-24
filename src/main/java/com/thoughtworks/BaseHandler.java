package com.thoughtworks;

public abstract class BaseHandler {

    private BaseHandler nextHandler;

    public abstract String getResult(int number);

    public BaseHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseHandler handler){
        this.nextHandler = handler;
    }
}
