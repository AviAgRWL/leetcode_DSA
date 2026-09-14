class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> m = new HashMap <Character , Integer>();
        HashMap<Character , Integer> m1 = new HashMap <Character , Integer>();
        char a=' ' , b = ' ' ; int k =0;
        if (s.length() !=t.length())
        return false;
        for (int i =0 ;i<s.length();i++)
        {
            a=s.charAt(i);
            b=t.charAt(i);
            m.put(a,m.getOrDefault(a , 0)+1);
            m1.put(b,m1.getOrDefault(b , 0)+1);

        }
        k=m.size();
        if (m.size ()!= m1.size() )
        return false ;

        for (Character key : m.keySet())
        {
            if (!(m1.containsKey(key)&& m.get(key).equals(m1.get(key))))
            return false;
        }
        return true ;
        
    }
}