class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<Character>();
        int m =0,b=0;
        for (int i =0;i<s.length();i++)
        {
            b=i;
            while (!set.contains(s.charAt(b)))
            {
                set.add(s.charAt(b));
                b++;
                if (b==s.length())
                break;
            }
            
            if (m<set.size())
            m=set.size();
            set.clear();
        }
        return m;
        
    }
}