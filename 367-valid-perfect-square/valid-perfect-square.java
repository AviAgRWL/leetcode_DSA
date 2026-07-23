class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1,right=num/2,k=0,mid=0;
        long sq =0;
        if (num==1)
        return true;
        while(left<=right)
        {

            mid =(left+right)/2;
            sq=(long)mid*mid;

            if (sq==num)
            return true;
            else if (sq>num)
            right=mid-1;
            else if (sq<num)
            left=mid+1;
        }
        return false;
        
    }
}