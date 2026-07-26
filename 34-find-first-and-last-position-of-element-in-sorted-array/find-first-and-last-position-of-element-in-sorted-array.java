class Solution {
    public int[] searchRange(int[] nums, int target) {
     int left=0,right=nums.length-1,left1=0,mid=0,right1=nums.length-1,m=-1,k=-1;
     while (left<=right)
     {
        mid = left+((right-left)/2);
        if(nums[mid]==target)
        {
            if (mid-1>=0&&nums[mid-1]==target)
            {
                right=mid-1;
                k=mid-1;
            }
            else {
                k=mid;
            
            break;
            }
            
        }
        else if (nums[mid]>target)
        right=mid-1;
        else left=mid+1;

     }
     if (k==-1)
     return new int[]{-1,-1};
     while (left1<=right1)
     {
        mid = left1+((right1-left1)/2);
        if(nums[mid]==target)
        {
            if (mid+1<=nums.length-1&&nums[mid+1]==target)
            {
                left1=mid+1;
                m=mid+1;
            }
            else
            { 
            m=mid;
            break;}
        }
        else if (nums[mid]>target)
        right1=mid-1;
        else left1=mid+1;


     }
     return new int[]{k,m};

     
     
    }
}