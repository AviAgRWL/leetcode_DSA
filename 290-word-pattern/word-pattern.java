class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <String , String > m = new HashMap<String , String >();
        int a =0,c=0;String k=" ", n =" ";
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '|| i==s.length()-1)
            {
                if (i==s.length()-1)
                i=i+1;
                n=s.substring (a,i);
                a=i+1;
                if(c>=pattern.length())
                return false;
                
                k=pattern.charAt(c)+" ";
                c++;
                
               if (m.containsKey(k))
               {
                if (!m.get(k).equals(n))
                  return false ;
             }
               else
               {
                if (m.containsValue(n))
                return false;
                m.put(k,n);
               }


            }
        }
        if (c!=pattern.length())
        return false;
        else 
        return true;
        
    }
}