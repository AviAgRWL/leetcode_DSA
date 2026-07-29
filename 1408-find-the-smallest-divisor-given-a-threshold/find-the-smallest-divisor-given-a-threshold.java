class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1,right=0,k=0,m=0;
        long mid=0;
        Arrays.sort(nums);
        right=nums[nums.length-1];
        while (left<=right)
        {
            mid =left+((right-left)/2);
            k=0;
            for (int i =0;i<nums.length;i++)
            {
                k+=Math.ceil((double)nums[i]/mid);

            }
            if (k<=threshold)
            {
                m=(int)mid;
                right=(int)mid-1;

            }
            else left=(int)mid+1;


        }
        return m;
        

        
    }
}