class Solution {
    public int singleNonDuplicate(int[] nums) {
        int  a=0,b=0;
        b=nums[0];
        for (int i =1;i<nums.length;i++)
        {
            a=nums[i];
            b=b^a;
        }
        return b;
    }
}