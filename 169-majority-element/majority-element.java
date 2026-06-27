class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int k =nums[0],c=1;
        if (nums.length==1)
        return nums[0];
        for (int i=1;i<nums.length;i++)

        {
            
            if (k==nums[i])
            {
                ++c;

            }
            else if(c>nums.length/2)
            {
             return k;
            }
            else 
            {
                c=1;
                k=nums[i];
            }
            if(k==nums[i]&&i==nums.length-1&&c>nums.length/2)
           return nums[i];
            
            
            
            
        }
        return -1;
    }
}