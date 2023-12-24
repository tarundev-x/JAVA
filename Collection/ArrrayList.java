/*ArrayList*/

import java.util.*;

class Collection
{
    public static void main(String args[])
    {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("DEV");
        arr.add("Tarun");
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
