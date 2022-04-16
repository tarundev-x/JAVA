/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
	
		String s=sc.next();
			char arr[]=s.toCharArray();
		String ans=""; 
		for(int i=0;i<s.length();i++)
		{
		    if(Character.isLetter(arr[i]))
		    {
		        ans+=arr[i];
		    }
		  //  if(s.charAt(i)>=97 && s.charAt(i)<=122)
		  //  {
		  //      ans+=s.charAt(i);
		  //  }
		}
		System.out.println(ans);
	}
}
