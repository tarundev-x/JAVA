/*package whatever //SELECTION SORT//Time Complexity==o(n2)//space--o(1) */

import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
 int arr[] = { 64, 25, 12, 22, 11 };
	
	int n=arr.length;
    	for(int i=0;i<n-1;i++)
    	{
    	   int minindex=i;
    	    // Find the index of the minimum element in the unsorted part
    	   for(int j=i+1;j<n;j++)
    	   {
    	       if(arr[j]<arr[minindex])
    	       {
    	           minindex=j;
    	       }
    	   }
        // Swap the found minimum element with the first element of the unsorted part
    	  if(minindex!=i)
    	  {
    	       int temp=arr[i];
    	   arr[i]=arr[minindex];
    	   arr[minindex]=temp;
    	  }
    	}
	for(int x:arr)
	{
	    System.out.print(x+" ");
	}
	
	
	}
}
