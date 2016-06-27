package com.thoughtworks;

class BuzzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int buzzNumber = 5;
        if (number % buzzNumber == 0) {
            result = "Buzz";
        }

        if (!result.equals("Buzz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
