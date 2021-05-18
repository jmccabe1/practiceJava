package com.example.NewPassword;

public class IntegerCompute extends Reverse {

//This is primarily used for testing purposes as of right now, to test if someone inputs a bunch of numbers. It should be integrated into Compute soon
    public static Boolean intPal(Integer y) { //This is kind of a bad name I'll admit, but since it's a double entendre between "integer palindrome" and "integer pal" it's staying
        String line = y.toString(); //First we convert the bunch of numbers into a String, because reverse takes a string
        if (line.equals(reverse(line))) { //After that we just call reverse and use the recursive return to determine whether the stringified integers are a "palindrome".
            return true; //We could've called palindromeRecursion in Compute to do the comparison logic, but it's four lines and this way there's less bouncing around
        }
        else return false;
    }
}
