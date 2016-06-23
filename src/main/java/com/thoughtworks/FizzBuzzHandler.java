package com.thoughtworks;

public class FizzBuzzHandler {
    public String getFizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 ==0){
            return "FizzBuzz";
        }
        return null;
    }
}
