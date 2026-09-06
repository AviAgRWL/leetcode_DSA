class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=0,count=0,mid=0,m=0,g=nums.length;
        for (int i =0;i<nums.length-2;i++)
        {
            for (int j=i+1;j<nums.length-1;j++)
            {
                m=nums[i]+nums[j];
                left=j+1;
                right=nums.length-1;
                g=nums.length;
                while(left<=right){
                mid=left+((right-left)/2);
                if (nums[mid]>=m)
                {
                    g=mid;
                    right=mid-1;
                    

                }
                else 
                {
                left=mid+1;
                }
                }
                count +=g-j-1;
            }
        }
        return count;
        
        
    }
}