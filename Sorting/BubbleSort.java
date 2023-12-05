/*package whatever //do not write package name here //  BUBBLE SORT ALGORITHM// Time Complexity--o(n2) //Bestcase--o(n)//space--o(1)//totalpaases--(n-1)*/ 

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={6,0,3,7,2,5};//12345
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
		    boolean flag=false;
		    
		    for(int j=0;j<n-1-i;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            flag=true;
		        }
		       
		    }
		    if(!flag)
		    {
		       break;
		    }
		    
		    
		}
		for(int x : arr)
		{
		    System.out.print(x);
		}
	}
}
.........................................................Using Scanner.............................

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
		
		for(int i=0;i<n-1;i++)
		{
		    boolean flag=false;
		    
		    for(int j=0;j<n-1-i;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            flag=true;
		        }
		       
		    }
		    if(!flag)
		    {
		       break;
		    }
		    
		    
		}
		for(int x : arr)
		{
		    System.out.print(x);
		}
	}
}

  
