class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=0,total=0;
        for (int j =0;j<nums.length;j++)
        total =total+nums[j];

        for (int i =0;i<nums.length;i++)
        {
            r= total - l-nums[i];
            if (l==r)
            return i ;
            l=l+nums[i];
        }
        return -1;
        
    }
}