class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int m =1,k=1;
        if (nums.length==0)
        return 0;
        int a =nums[0];
        for (int i =1;i<nums.length;i++)
        {
            if (nums[i]==nums[i-1])
            continue;
            if (a+1==nums[i])
            {
                k++;
                a++;

            }
            else {
                
                
                a=nums[i];
                k=1;
                
            }
            if (m<k)
            m=k;
        }
        return m;

        
    }
}