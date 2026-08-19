class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1,mid=0,k=Integer.MAX_VALUE;
        while(left<=right)
        {
            mid=(left+right)/2;
            if (nums[mid]<k)
            k=nums[mid];
            else if (nums[mid]>nums[right])
            {
                left=mid+1;

            }
            else 
            right=mid-1;

            
            
        }
        return k;
        
    }
}