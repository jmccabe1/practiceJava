package com.example.NewPassword;

public class Compute extends Reverse{ //We'll need the reverse function in the Reverse abstract class, so Compute will extend Reverse and inherit it
    public static Boolean isPalindrome(String line){ //line will be passed from Controller, which will pull it from the Get. This version doesn't use the recursive Reverse class
        int x = 0; //This will be helpful as an index counter for when we're going through each letter in our test loop. It is initialized at 0 so that it first looks at the first character of the passed string
        boolean result = true; //This will be returned at the end. It's set to true so that intellisense will stop yelling at me about it, but will be manually defined in the loop
        boolean running = true; //This is set to true to make sure the do-while loop actually loops. Should either of the if statements return true, the answer has been reached and this will be set to false so we can exit
        if (line == null) { //In case some joker decides to put in nothing and call it something, we'll define nothing as false
            return false;
        }
        if (line.length() == 0 || line.length() == 1) { //In case someone manages to input a string that has 0 length, or inputs just one character
            return false;
        }
        do { //Here we look at each character and check whether it's the same as the character at the corresponding position away from the end
            if (line.charAt(x) != line.charAt(line.length() - (x + 1))) { //Here we look at both the string at position x and at position length - (x+1) and compare them.
                //We come in here if the characters at these positions are not the same, and confirming this is not a palindrome
                result = false; //We define our return as false
                running = false; //and we tell our loop it's time to stop because we've already found the answer
            }
            else if (x >= (line.length() - (x + 1)) ){ //Here we check to see whether we've run out of characters to check and our front-index has reached our back-index
                result = true; //If we've reached the end and haven't exited the loop already, we must have ourselves a palindrome. We set our return to true
                running = false;//and we tell our loop it's time to stop
            }
            x++; //Every time we increment x, the front-index gets further down and the value of what we're subtracting from .length() gets larger which means the back-index gets closer to the front
            //line.length() - (x + 1) means that higher x values will result in more being subtracted from the .length() value, which means charAt() will be at a lower index moving it backwards. The + 1 is necessary because x starts at 0 and .length does not consider 0
        } while (running); //running will be true until one of the if statements evaluates to true, and so the loop will keep running until an answer is reached
        return result;
    }

    public static Boolean palindromeRecursion(String line) { //This does the same thing as isPalindrome, but uses the recursive function in the abstract class Reverse to do it
        if (line.equals(reverse(line))) { //reverse() returns the reversed string, so we'll need to take our original string and compare it to the reversed version to see whether they're the same
            return true; //if they are, we have a palindrome and so we go here to return true
        }
        else return false; //if they aren't, it isn't a palindrome and we don't go into the if statement, so we return false
    }


}
