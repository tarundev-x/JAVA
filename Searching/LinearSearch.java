/*package whatever //do not write package name here */
// time complexity--O(n)

import java.io.*;//

class GFG {
    static void merge(int left,int middle,int right,int arr[])
    {
        int l=middle-left+1;
        int r=right-middle;
        
        int larr[]=new int[l];
        int rarr[]=new int[r];
        
        
        
        for(int i=0;i<l;i++)
        {
            larr[i]=arr[left+i];
        }
        
        for(int j=0;j<r;j++)
        {
            rarr[j]=arr[middle+1+j];
        }
        
       int i=0;
       int j=0;
        int k=left;
        while(i<l&&j<r)
        {
            if(larr[i]<=rarr[j])
            {
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<l)
        {
            arr[k]=larr[i];
            k++;
            i++;
            
        }
        while(j<r)
        {
            arr[k]=rarr[j];
            k++;
            j++;
        }
    }
    static void display(int arr[])
    {
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
    static void mergesort(int left,int right,int arr[] )
    {
        int middle;
        if(left<right)
        {
            middle=(left+right)/2;
            
            mergesort(left,middle,arr);
            mergesort(middle+1,right,arr);
            
            merge(left,middle,right,arr);
            
            
        }
    }
    
	public static void main (String[] args) {
		int arr[]={5,1,8,3,9,2};
		int n=arr.length;
		GFG.mergesort(0,n-1,arr);
		GFG.display(arr);
	}
}
