package com.thoughtworks;

 class WhizzHandler extends BaseHandler {

     @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
         int whizzNumber = 7;
         if (number % whizzNumber == 0) {
            result = "Whizz";
        }
        if (!result.equals("Whizz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
