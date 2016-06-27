package com.thoughtworks;

class BuzzWhizzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int buzzNumber = 5;
        int whizzNumber = 7;
        if (number % buzzNumber == 0 && number % whizzNumber == 0) {
            result = "BuzzWhizz";
        }
        if (!result.equals("BuzzWhizz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
