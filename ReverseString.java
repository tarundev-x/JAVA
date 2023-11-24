// Write a Java program to reverse a string.

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int n=str.length();
		for(int i=0;i<(n/2);i++ )
		{
		    char ch=arr[i];
		    arr[i]=arr[n-i-1];
		    arr[n-i-1]=ch;
		}
		String ans=new String(arr);
		System.out.print(ans);
	}

}
