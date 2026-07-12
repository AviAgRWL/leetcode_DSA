class Solution {
    public String longestPalindrome(String s) {
        Boolean m =true;
        int d=0;
        String k =s.charAt(0)+"";
        
        for (int i =0;i<s.length()-1;i++)
        {
            for (int j=s.length()-1;j>i;j--)
            {
                if (s.charAt(i)==s.charAt(j))
                {
                m=pallindrome(s.substring(i,j+1));
                if (m)
                if ((s.substring(i,j+1)).length()>d)
                {
                d=(s.substring(i,j+1)).length();
                k=s.substring(i,j+1);
                }
                }
                

            }
        }
        return k;
        
        
    }
    public Boolean pallindrome(String a)
    {
       int left=0;
       int right=a.length()-1;
        while (left<=right)
        {
            if (a.charAt(left)==a.charAt(right))
            {
                left++;
                right--;
            }
            else 
            return false;
        
        }
        return true;
    }
}