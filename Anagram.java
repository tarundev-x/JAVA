Anagram

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter the first string");
		String str1=sc.nextLine();
// 		System.out.print("Enter the second string");
		String str2=sc.nextLine();
		
		char[] chararr1=str1.toCharArray();
		char[] chararr2=str2.toCharArray();
		
		Arrays.sort(chararr1);
		Arrays.sort(chararr2);
		
		if(Arrays.equals(chararr1,chararr2))
		{
		    System.out.print(true);
		}
		else{
		    System.out.print(false);
		}
	}
}
