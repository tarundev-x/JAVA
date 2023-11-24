
Write a Java Program to find the factorial of a given number.

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.print(ans);
	}
	public static int factorial(int n)
	{
	    if(n==0)
	    {
	        return 1;
	    }
	    return n*factorial(n-1);
	}
}
