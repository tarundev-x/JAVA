package com.girmit.Palindrome;

public class PalinImplementation {
    public Boolean FindPalin(String s2)
    {

        String str="";
        for(int i=0;i<s2.length();i++)
        {
            str=s2.charAt(i)+ str;
        }
        String news=str;
        return str.equals(s2);
    }

}
