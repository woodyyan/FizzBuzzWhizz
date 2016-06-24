package com.thoughtworks;

public class NumberHandler extends BaseHandler {
    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);

        if (getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
