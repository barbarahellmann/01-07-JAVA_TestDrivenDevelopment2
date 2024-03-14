package org.example;
public class Main {
    public static String play(int input) {
        if (input%3==0 && input%5==0){
            return "FIZZBUZZ";
        } else if (input%5==0) {
            return "BUZZ";
        } else if (input%3==0){
            return "FIZZ";
        }
        return ""+input;
    }
}