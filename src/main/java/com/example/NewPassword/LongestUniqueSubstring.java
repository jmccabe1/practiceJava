package com.example.NewPassword;

import java.util.ArrayList;
import java.util.List;
/*
This puzzle is one I saw on a skills test in an application. The question's exact wording was to "design an algorithm or
function to find the longest substring which contains 2 unique characters in a given string." I interpreted this to say it
will contain the substring that sits between the first and last character in the given string that are unique.
There's a chance I'm misinterpreting the question, as it could be asking for the longest series of characters in the given
string that are just those two characters. Because this function lets a unique character in the middle of the string be included in
the returned substring it may not count either, but based on my interpretation of the question that shouldn't matter.
*/

public class LongestUniqueSubstring {
    public static String findSubstring(String input) { //We pull in the string that the GetMapping in the controller received
        String solution; //This is where we will store the substring to be returned
        List<Character> bookends = new ArrayList<>();//This is where we'll store the unique characters
        for(int x = 0; x < input.length(); x++) { //We loop through each character in the input to test out each character
            for (int i = 0; i < input.length(); i++) {//We're looping through them all again, this time to get the second comparitor
                if ( input.charAt(x) == input.charAt(i) || x != i) { //If the one we're comparing to is the same as the one we're comparing from and isn't at the same position marking it as the same character as our tested character,
                    break;//...we know we have a character that isn't unique and we can stop testing this character. This break should get us out of the first "i" for loop without getting out of the larger "x" for loop
                } else if (i + 1 >= input.length()) {//If we've reached the end of arr and the next iteration of the for loop with end testing this char, and we still haven't found a duplicate, we have a unique char
                    bookends.add(input.charAt(x));//So, we add it to the list of unique characters we created on line 18
                }
            }
        }
        solution = input.substring(input.indexOf(bookends.get(0)), input.indexOf(bookends.get(bookends.size() - 1)));
        //This long line finds the substring we want in input by grabbing the first and last chars in bookends and finding the index of those
        //chars in input, then using those as the substring's beginning and end indexes to create the desired substring and save it in solution
        return solution;
    }
}
