 public static int[] greaterElement (int arr[], int n) {
        // Complete the functionint 
        int[]ans = new int[n];
        TreeSet<Integer>set=new TreeSet<>();
        for(int i:arr)
          set.add(i);
          for(int i=0;i<n;i++)
          {
              ans[i]=set.higher(arr[i])==null?-10000000:set.higher(arr[i]);
          }
        return ans;
        }
        
        
 ...........................
 TreeSet higher() method in Java
 The higher(E ele) method of TreeSet class in Java is used to return the least element
 in this set which is strictly greater than the given element ele.
 If no such element is there then this method returns NULL.

Here, E is the type of element maintained by this TreeSet collection.


TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage.
The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided.

TreeSet():
This constructor is used to build an empty TreeSet object in which elements will get stored in default natural sorting order.
