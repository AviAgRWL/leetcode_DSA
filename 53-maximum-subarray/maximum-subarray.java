class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0],n=nums[0];
        for (int i =1;i<nums.length;i++)
        {
            m=Math.max(nums[i],m+nums[i]);
            n=Math.max(n,m);
        }
        return n;

        
    }
}