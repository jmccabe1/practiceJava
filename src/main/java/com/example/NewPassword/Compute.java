package com.example.NewPassword;

public class Compute {
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
        String reversed = new String();
        if (line.equals(reversion(line))) {
            return true;
        }
        else return false;
    }

    public static String reversion (String line) {
        if (line == null || line.equals("")) {
            return "";
        }
        else {
            return (line.substring(line.length() - 1, line.length()) +
            reversion(line.substring(0, line.length() - 1)));
        }
    }
}
