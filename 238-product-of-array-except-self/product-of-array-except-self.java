class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int [nums.length];
        int b[]=new int [nums.length];
        a[0]=1;
        for (int i =1;i<nums.length;i++)
        {
            a[i]=a[i-1]*nums[i-1];

        }
        for (int j=nums.length-1;j>=0;j--)
        {
            if(j==nums.length-1)
            {
            b[j]=1;
            continue;
            }
            b[j]=nums[j+1]*b[j+1];





        }
        for (int i=0;i<nums.length;i++)
        nums[i]=a[i]*b[i];
        return nums;
        
        
    }
}