
// Check if a given string is palindrome using recursion.

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) 
	{
	    Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println("Is "+word+" palindrome? - "+isWordPalindrome(word));
		
	}
	
  public static	boolean isWordPalindrome(String word)
	{
	    String reverse=getReverseWordReverse(word);
	    if(word.equals(reverse))
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
	
    public static String getReverseWordReverse(String word)
	{
	    if(word==null ||word.isEmpty())
	    {
	        return word;
	    }
	    return word.charAt(word.length()-1)+ getReverseWordReverse(word.substring(0,word.length()-1));
	}
	
}




