class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=0,k=0,m=0;
        long mid=0,d=0;
        for (int i =0;i<piles.length;i++)
        {
            if (k<piles[i])
            k=piles[i];
        }
        right=k;
        while(left<=right)
        {
            mid=left+((right-left)/2);
            d=0;
            for (int i =0;i<piles.length;i++)
            {   if (mid==0)
                  break;
                  if (piles[i]%(int)mid!=0)
                  {
                    d+=(long)(piles[i]/(int)mid)+1;

                  }
                  else
                d+=(long)(piles[i]/(int)mid);
                
            }
            if (d<=h)
            { k= (int)mid;
right = (int)mid - 1;}
            
            else if (d>h)
            left=(int)mid+1;
            else 
            right=(int)mid-1;
        }
        return k;

        
    }
}