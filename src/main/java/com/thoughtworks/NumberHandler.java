package com.thoughtworks;

class NumberHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);

        if (getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
