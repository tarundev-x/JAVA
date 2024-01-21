
/*2. Write a Java program to implement a lambda expression to check if a given string is a palindrome.*/
package com.girmit.Palindrome;


public class Main {
    public static void main(String[] args) {
        String s ="dalda";
       int n=s.length();

        PalinImplementation palinImplementation = new PalinImplementation();
        PalindromeInterface palindromeInterface =(y)->palinImplementation.FindPalin(s);
        System.out.println(palindromeInterface.PalinString(s));

    }
}