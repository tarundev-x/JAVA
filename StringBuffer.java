/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
	
		String s=sc.next();
		String arr[]=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
		    StringBuffer sb1=new StringBuffer(arr[i]);
		    System.out.print(sb1.reverse()+" ");
		}
		
	}
}
