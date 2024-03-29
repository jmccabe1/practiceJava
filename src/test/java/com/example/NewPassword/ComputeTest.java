package com.example.NewPassword;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ComputeTest {

    @Test
    void ifStringIsPalindrome() {
        Assert.isTrue(Compute.isPalindrome("bob"));
    } //.isTrue may be depreciated, but it still functions

    @Test //Manually putting @Test over each of these is annoying, but unfortunately necessary
    void ifPalindromeNumber() { Assert.isTrue(IntegerCompute.intPal(12321));}

    @Test
    void ifStringIsPalindrome9() {
        Assert.isTrue(Compute.palindromeRecursion("bob"));
    }

    @Test
    void ifStringIsNotPalindrome() {
        Assert.isTrue(!Compute.isPalindrome("boo"));
    }

    @Test
    void ifStringIsNotPalindrome2() {
        Assert.isTrue(Compute.isPalindrome("AAAA"));
    }

    @Test
    void ifStringIsNotPalindrome3() {
        Assert.isTrue(!Compute.isPalindrome("John"));
    }

    @Test
    void ifStringIsNotPalindrome4() {
        Assert.isTrue(!Compute.isPalindrome("johj"));
    }

    @Test
    void ifStringIsNotPalindrome5() {
        Assert.isTrue(!Compute.isPalindrome("Jooj"));
    }

    @Test
    void ifStringIsNotPalindrome6() {
        Assert.isTrue(!Compute.isPalindrome(""));
    }

    @Test
    void ifStringIsNotPalindrome7() {
        Assert.isTrue(!Compute.isPalindrome("shujodag;swgdhuo;sgrhujo;ewghuoj;ewfgdhujdfffffffffuhjosdghgjolnsgdhouj;esgrdNHUJOL?esvgDRnhujol//svdBnhujol/srdvbvnhujol/esvgrDhujolaesbnDhujoeasglDashujodvesdghUJOvhdsZUJOghrusoDhgvusdihgusdhgousdnivulasdnlkvbwdihslfhyuiaewrlhgfyuiearwghyiuewahgfiuaewhugieharwiyughreayigh"));
    } //A good test deck tests every possible input, up to and including slamming your face on the keyboard for three minutes
    //In a real environment there's tools with which you can test a maxed length input, but this is serviceable for a small scale puzzle solving exercise

    @Test
    void ifStringIsNotPalindrome8() {
        Assert.isTrue(!Compute.isPalindrome(null));
    }


}