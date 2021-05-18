package com.example.NewPassword;

public class IntegerCompute extends Reverse {

//This is only used for testing purposes, when you input a string of integers by way of the GetMapping in Controller it automatically stringifies it but testing doesn't so we need to manually stringify a series of integers for the tests to work
    public static Boolean intPal(Integer y) { //This is kind of a bad name I'll admit, but since it's a double entendre between "integer palindrome" and "integer friend" it's staying
        String line = y.toString(); //First we convert the bunch of numbers into a String, because reverse takes a string
        if (line.equals(reverse(line))) { //After that we just call reverse and use the recursive return to determine whether the stringified integers are a "palindrome".
            return true; //We could've called palindromeRecursion in Compute to do the comparison logic, but it's four lines and this way there's less bouncing around
        }
        else return false;
    }
}
