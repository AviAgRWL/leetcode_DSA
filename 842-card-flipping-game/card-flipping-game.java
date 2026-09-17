class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> s = new HashSet<Integer>();
       HashSet<Integer> s1 = new HashSet<Integer>();
       int m =Integer.MAX_VALUE;
       for(int i =0;i<fronts.length;i++)
       {
        
        s.add(fronts[i]);
        s.add(backs[i]);
       }
       for (int i =0;i<fronts.length;i++)
       {
        if (fronts[i]==backs[i])
        s.remove (fronts[i]);
       }
       if (s.size()==0)
       return 0;
       for (Integer x : s)
       {
        if(x<m)
        m=(int)x;
       }
       return m ;
    }}