package com.example.NewPassword;

public abstract class Reverse {
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
