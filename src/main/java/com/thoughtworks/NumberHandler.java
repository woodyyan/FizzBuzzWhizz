package com.thoughtworks;

public abstract class NumberHandler {

    private NumberHandler nexthandler;

    public abstract String getNumber(int number);

    public NumberHandler getNextHandler() {
        return nexthandler;
    }

    public void setNexthandler(NumberHandler handler){
        this.nexthandler = handler;
    }
}
