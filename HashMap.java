static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char c;
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        
        for(int i=0;i<S.length();i++)
        {
            mp.put(S.charAt(i),mp.getOrDefault(S.charAt(i),0)+1);
        }
        for(int i=0;i<S.length();i++)
        {
            if(mp.get(S.charAt(i))==1) return S.charAt(i);
        }
        return '$';
