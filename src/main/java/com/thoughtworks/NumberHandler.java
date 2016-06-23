package com.thoughtworks;

public abstract class NumberHandler {

    private NumberHandler nextHandler;

    public abstract String getNumber(int number);

    public NumberHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(NumberHandler handler){
        this.nextHandler = handler;
    }
}
