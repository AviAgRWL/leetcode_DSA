class Solution {
    public int reachNumber(int target) {
        int c=1,k=0;
        if (target<0)
        target=-(target);
        while (c>0)
        {
            k=((c*(c+1))/2);
            if (k>=target)
            {
            if ((k-target)%2==0)
            return c;
            else c++;
            }
            else c++;;

        }

        return -1;
        
    }
}