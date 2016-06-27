package com.thoughtworks;

class FizzBuzzWhizzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int buzzNumber = 5;
        int fizzNumber = 3;
        int whizzNumber = 7;
        if (number % fizzNumber == 0
                && number % buzzNumber == 0
                && number % whizzNumber == 0) {
            return "FizzBuzzWhizz";
        }
        if (!result.equals("FizzBuzzWhizz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
