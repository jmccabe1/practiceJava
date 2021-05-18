package com.example.NewPassword;

public abstract class Reverse { //No need to instantiate this since it's just a logic class, so it's an abstract class
    public static String reverse(String line) {
        if (line == null || line.equals("")) { //In case some brainiac decides to be funny and tries to input a blank line
            return "";
        }
        else {
            return (line.substring(line.length() - 1, line.length()) +
                    reverse(line.substring(0, line.length() - 1))); //This is recursive, to rebuild the passed string in reverse one iteration at a time. I'm not a fan of recursive functions, but they're useful
        }
    }
}
