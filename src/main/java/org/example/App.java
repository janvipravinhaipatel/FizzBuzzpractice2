package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static String FizzBuzz(int a) {
        String Output = " ";
        if(a%3==0 && a%5==0) {
            return ("FizzBuzz");
        }
            else if(a%3==0){
                return ("Fizz");
            }
            else if (a%5==0) {
            return ("Buzz");
        }

        return Output;
    }
    public static void main (String[]args){
    }
}




