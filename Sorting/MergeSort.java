/*package whatever //do not write package name here//Timecomplexity--n*log(n) //Space--O(N)*/

import java.io.*;

class GFG {
    
   static void merge(int left,int right,int middle,int arr[])//1234567
    {
        int size_left_array=middle-left+1;
        int size_right_array=right-middle;
        int leftArr[]=new int[size_left_array];
        int rightArr[]=new int[size_right_array];
        int i=0,j=0;
        
        for(i=0;i<size_left_array;i++)
        {
            leftArr[i]=arr[left+i];
        }
        for(j=0;j<size_right_array;j++)
        {
            rightArr[j]=arr[middle+j+1];
        }
        int k=left;
        i=0;
        j=0;
        while(i<size_left_array && j<size_right_array)
        {
            if(leftArr[i]<rightArr[j])
            {
                arr[k]=leftArr[i];
                i++;
                
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
           
        }
         while(i<size_left_array)
            {
                arr[k]=leftArr[i];
                i++;
                k++;
            }
            while(j<size_right_array)
            {
                arr[k]=rightArr[j];
                j++;
                k++;
            }
        
    }
   static void display(int arr[])
    {
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
    
    
  static  void mergesort(int left,int right,int arr[])
    {
        int middle;
        if(left<right)
        {
            middle=(left+right)/2;//2,3,4,5,6,7
            mergesort(left,middle,arr);
            mergesort(middle+1,right,arr);
            merge(left,right,middle,arr);
            
        }
    }
	public static void main (String[] args) {
		int[] arr={2,9,0,3,4,5,6,7};
		int n=arr.length;
		
		GFG.mergesort(0,n-1,arr);
		GFG.display(arr);
	}
}
