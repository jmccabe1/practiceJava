package com.example.NewPassword;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class LongestUniqueSubstringTest {
    @Test
    void substringTestOne() {
        Assert.isTrue(LongestUniqueSubstring.findSubstring("accbaaaccaccadaac") == "aaaccacca");
        //Personal note: depending on whether substring() is inclusive of its parameter indexes or not, this might include B and D in the
        //returned substring. This can be fixed fairly easily, I believe, though it will likely require splitting up the logic into
        //multiple lines that's currently completely enclosed in LongestUniqueSubstring line 27
    }

    @Test
    void substringTestTwo() {
        Assert.isTrue(LongestUniqueSubstring.findSubstring("accbaaaccvaccadaac") == "aaaccvacca");
        //In all honesty, including V in the returned substring even though V is unique doesn't feel right, but if that's
        //what the question is asking for, who am I to judge
    }
}
