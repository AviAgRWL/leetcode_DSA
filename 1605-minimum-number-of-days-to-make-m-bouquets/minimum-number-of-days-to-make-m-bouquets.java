class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=Integer.MAX_VALUE,right=0,g=-1,c=0,d=0;
        long mid=0;
        if ((m*k)>bloomDay.length)
        return -1;
        for (int i =0 ;i< bloomDay.length;i++)
        {
            if (bloomDay[i]>right)
            right=bloomDay[i];
            if (bloomDay[i]<left)
            left=bloomDay[i];

        }
        while(left<=right)
        {
            c=0;
            d=0;
            mid=(long)left+((right-left)/2);
            for (int i =0;i<bloomDay.length;i++)
            {
                if (mid>=bloomDay[i])
                c++;
                else 
                c=0;
                if (c==k)
                {d++;
                c=0;}
                
                

                
            }
            
            if (d>=m)
            {
            g=(int)mid;
            right=(int)mid-1;
            }
            
            else 
            left=(int)mid+1;
        }
        return g;
        
    }
}