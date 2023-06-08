package org.example;

public class Calculator {


    public int addition(int a, int b){
        return a + b ;
    }

    public int sousrtaction(int a,int b){
        return  a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public String divison(int a, int b) {
        try {
            return String.valueOf(a / b) ;
        } catch (Exception e) {
            return  "ne pas utiliser 0";
        }
    }

    public int divison2 (int a, int b) throws ArithmeticException {
        return a/b;
    }



}
