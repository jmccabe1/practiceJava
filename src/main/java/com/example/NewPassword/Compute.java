package com.example.NewPassword;

public class Compute extends Reverse{
    public static Boolean isPalindrome(String line){
        int x = 0;
        boolean result = true;
        boolean running = true;
        if (line == null) {
            return false;
        }
        if (line.length() == 0 || line.length() == 1) {
            return false;
        }
        do {
            if (line.charAt(x) != line.charAt(line.length() - (x + 1))) {

                result = false;
                running = false;
            }
            else if (x >= (line.length() - (x + 1)) ){
                result = true;
                running = false;
            }
            x++;
        } while (running);
        return result;
    }

    public static Boolean palindromeRecursion(String line) {
        if (line.equals(reverse(line))) {
            return true;
        }
        else return false;
    }


}
