package com.thoughtworks;

public class FizzBuzzHandler extends NumberHandler{
    public String getFizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 ==0){
            return "FizzBuzz";
        }
        return null;
    }

    @Override
    public String getNumber(int number) {
        String result = getFizzBuzz(number);
        if (result == null){
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
