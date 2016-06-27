package com.thoughtworks;

class FizzBuzzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        int buzzNumber = 5;
        if (number % fizzNumber == 0 && number % buzzNumber == 0) {
            result = "FizzBuzz";
        }
        if (!result.equals("FizzBuzz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
