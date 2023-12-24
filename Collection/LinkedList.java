/*LinkedList*/

import java.util.*;

class Collection
{
    public static void main(String args[])
    {
        LinkedList<String> arr=new LinkedList<>();
        arr.add("DEV");
        arr.add("Tarun");
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
