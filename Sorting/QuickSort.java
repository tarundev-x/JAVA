/*package whatever //do not write package name here */

// Time Complexity:
// Average Case: O(N * logN), where N is the length of the array.
// Best Case: O(N * logN)
// Worst Case: O(N2)
// Auxiliary Space: O(1)
// import java.io.*;//


import java.io.*;

class GFG {
    static int partition(int arr[],int lb,int ub)
    {
        int pivot=arr[lb];//{4,6,2,5,7,9,1,3};//{4,3,2,5,7,9,1,6}4
        
        int start=lb;
        int end=ub;
        while(start<end)
        {
            while(arr[start]<=pivot && start<end)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
         int temp=arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;
     return end;
    }
    
    static void quicksort(int arr[],int low,int high)
    {
       if(low<high)
       {
           int part=partition(arr,low,high);
           //seperately sorting the element before and after partition
           quicksort(arr,low,part-1);
           quicksort(arr,part+1,high);
       }
    }
	public static void main (String[] args) {
	int arr[]={4,6,2,5,7,9,1,3};
	int n=arr.length;
	
	quicksort(arr,0,n-1);
	
	for(int a:arr)
	{
	    System.out.println(a);
	}
	}
}
