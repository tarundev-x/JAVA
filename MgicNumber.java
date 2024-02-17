// Write a Java Program to check if any number is a magic
// number or not. A number is said to be a magic number if
//  doing sum of digits is  equal to 1
// 164 ==1+6+4 
// n-n/10

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	

	    int sum=0;
	    while(n>0  | n>9)
	    {
	        if(n==0)
	        {
	            n=sum;
	            sum=0;
	        }
	        sum=sum+n%10;
	        n=n/10;
	        
	    }
	    
	    if(sum==1)
	    {
	        System.out.print("magic");
	    }
	    else{
	        System.out.print("Not magic");
	    }
	
	
	}
}
