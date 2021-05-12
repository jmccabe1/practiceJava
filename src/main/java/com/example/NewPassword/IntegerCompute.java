package com.example.NewPassword;

public class IntegerCompute extends Reverse {


    public static Boolean intPal(Integer y) {
        String line = y.toString();
        if (line.equals(reversion(line))) {
            return true;
        }
        else return false;
    }
}
