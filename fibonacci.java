
// Write a Java Program to print Fibonacci Series using Recursion.
// 0 1 1 2 3 5 8
import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("fibonacci number ..!");
		
		System.out.print("0 1 ");
		
		printfibonaccci(0,1,10);
	}
	
	public static void printfibonaccci(int first,int second,int number)
	{
	   
	   if(number==0) return;
	        System.out.print(first+second+" ");
	    printfibonaccci(second,first+second,--number);
	  
	}
}
