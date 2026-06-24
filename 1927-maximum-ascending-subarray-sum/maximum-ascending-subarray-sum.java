class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum =nums[0];int n=0;
        if (nums.length==1)
        return nums[0];
        for(int i =1;i<nums.length;i++)
        {
            
            if (nums[i-1]<nums[i])
            {
                sum=sum+nums[i];
            }
             if (nums[i-1]>=nums[i]||i==nums.length-1)
             {
                if (n<sum)
                n=sum;
                sum=nums[i];
             }
        }
        return n;
        
    }
}