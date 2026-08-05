class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=k;
        double sum=0,m=0,b=0;
        for (int i =0 ;i<k;i++)
            {
                sum+=nums[i];
            }
        m=sum/k;
        while (right<nums.length){
            
            sum=sum-nums[left]+nums[right];
            b=sum/k;
            if (m<b)
            m=b;
            left++;
            right++;
            
        }
        return m;
    }
}