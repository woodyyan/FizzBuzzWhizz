package com.thoughtworks;

class FizzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        if (number % fizzNumber == 0) {
            result = "Fizz";
        }
        if (!result.equals("Fizz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
