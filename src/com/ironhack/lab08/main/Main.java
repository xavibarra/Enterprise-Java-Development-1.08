package com.ironhack.lab08.main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        System.out.println(exercise1(4.2545));
        System.out.println(exercise2(-34.45));
    }
    public static double exercise1(double value){
        BigDecimal number1 =new BigDecimal(value);
        return number1.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static BigDecimal exercise2(double value){
        BigDecimal negative =new BigDecimal(-1);
        BigDecimal result1 =new BigDecimal(value).multiply(negative);
        return result1.setScale(1, RoundingMode.HALF_UP);
    }



}

