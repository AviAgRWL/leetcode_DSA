class Solution {
    public void nextPermutation(int[] nums) {
        int c=0, k=0;
        for (int i =nums.length-2;i>=0;i--)
        {
            if (nums[i]<nums[i+1])
            {
                c++;
                k=i;
                smallest( nums, i );
                break;
            }

        }
        if (c==0)
        {
            reverse(nums);
            System.out.println(Arrays.toString(nums));
        }
        else 
        Arrays.sort(nums,k+1,nums.length);
        System.out.println(Arrays.toString(nums));
      

        
    }
    public void smallest(int nums[],int j)
    {
        int m =j+1;
        for (int i=j+1;i<nums.length;i++)
        {
            if (nums[i]<=nums[m]&& nums[i]>nums[j])
            m=i;
        }
        swap(nums,j,m);

    }
    public void swap(int nums[],int i,int j)
    {
        int a=0;
        a=nums[i];
        nums[i]=nums[j];
        nums[j]=a;

    }
     public void reverse(int nums[])
     {
        
         int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        swap(nums, left, right);
        left++;
        right--;
     }

}}
