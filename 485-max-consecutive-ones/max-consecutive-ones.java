class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,m=0;
        
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            {
                c++;

            }
             if (nums[i]==0||i==nums.length-1)
            {
                if (m<c)
                {

                
                m=c;
                c=0;
                }
                c=0;
            }
        }
        return m;
        
    }
}