/*package whatever //do not write package name here */
time complexity--log(n)
import java.io.*;

class GFG {
    
    static int BinarySearch(int arr[],int k)
    {
        int n=arr.length;
        if(n<=0)
        {
            return -1;
        }
        int low=0;
        int high=n-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
	public static void main (String[] args) {
		int arr[]={5,2,9,22,6};
		int k=22;
        int ans=GFG.BinarySearch(arr,k);
        if(ans==-1)
        {
            System.out.println("Not found");
        }
        else{
            System.out.println(ans+1);
        }
		
	}
}

...........................RECURSIVE APPROACH............................

  /*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int BinarySearch(int arr[],int low,int high, int k)
    {
        
       
        
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>k)
            {
              return BinarySearch(arr,low,mid-1,k);
            }
            else{
                return BinarySearch(arr,mid+1,high,k);
            }
        }
        return -1;
    }
	public static void main (String[] args) {
		int arr[]={5,2,9,22,6};
		int k=22;
		int n=arr.length;
        int ans=GFG.BinarySearch(arr,0,n-1,k);
        if(ans==-1)
        {
            System.out.println("Not found");
        }
        else{
            System.out.println(ans+1);
        }
		
	}
}
