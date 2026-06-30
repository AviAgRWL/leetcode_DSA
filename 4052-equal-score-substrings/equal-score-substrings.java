class Solution {
    public boolean scoreBalance(String s) {
        int  a[]=new int [s.length()];
        int sum=0;
        for (int i=0;i<s.length();i++)
        {
            sum+=(s.charAt(i)-'a')+1;
            a[i]=sum;

        }
        for (int i =0;i<s.length();i++)
        {
            if (a[i]==a[a.length-1]-a[i])
            return true;
        }
        return false;

        
    }
}