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
    }

    @Test
    void ifStringIsPalindrome9() {
        Assert.isTrue(Compute.palindromeRecursion("bob"));
    }

    @Test
    void ifStringIsNotPalidnrome() {
        Assert.isTrue(!Compute.isPalindrome("boo"));
    }

    @Test
    void ifStringIsNotPalidnrome2() {
        Assert.isTrue(Compute.isPalindrome("AAAA"));
    }

    @Test
    void ifStringIsNotPalidnrome3() {
        Assert.isTrue(!Compute.isPalindrome("John"));
    }

    @Test
    void ifStringIsNotPalidnrome4() {
        Assert.isTrue(!Compute.isPalindrome("johj"));
    }

    @Test
    void ifStringIsNotPalidnrome5() {
        Assert.isTrue(!Compute.isPalindrome("Jooj"));
    }

    @Test
    void ifStringIsNotPalidnrome6() {
        Assert.isTrue(!Compute.isPalindrome(""));
    }

    @Test
    void ifStringIsNotPalidnrome7() {
        Assert.isTrue(!Compute.isPalindrome("shujodag;swgdhuo;sgrhujo;ewghuoj;ewfgdhujdfffffffffuhjosdghgjolnsgdhouj;esgrdNHUJOL?esvgDRnhujol//svdBnhujol/srdvbvnhujol/esvgrDhujolaesbnDhujoeasglDashujodvesdghUJOvhdsZUJOghrusoDhgvusdihgusdhgousdnivulasdnlkvbwdihslfhyuiaewrlhgfyuiearwghyiuewahgfiuaewhugieharwiyughreayigh"));
    }

    @Test
    void ifStringIsNotPalidnrome8() {
        Assert.isTrue(!Compute.isPalindrome(null));
    }


}