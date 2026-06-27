class Solution {
    public int minStartValue(int[] nums) {
        int a =0,b=0;
        for (int i =0;i<nums.length;i++)
        {
            nums[i]=nums[i]+a;
            a=nums[i];
            if (nums[i]<b)
            b=nums[i];
        }
        if (b>=0)
        return 1;
        else
        {
        int c=Math.abs(b);
        return c+1;
        }

        
    }
}