class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0,rightsum=0,a=0;
        if(nums.length==1)
        return 0;
        for (int i =1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        for (int j=0;j<nums.length;j++)
        {
            if (j==0)
            {
            leftsum=0;
            rightsum=nums[nums.length-1]-nums[j];
            
            }
            else if (j==nums.length-1)
            {
                leftsum=nums[nums.length-2];
                rightsum=0;
                
            }
            else 
            {
                leftsum=nums[j-1];
                rightsum=nums[nums.length-1]-nums[j];
                
            }
            if (leftsum==rightsum)
            return j;
        }
        return -1;
    }
}