class Solution {
    public void sortColors(int[] nums) {
        int c=0,d=0,e=0;
        for (int i =0;i<nums.length;i++)
        {
            if (nums[i]==0)
            c++;
            else if (nums[i]==1)
            d++;
            else if (nums[i]==2)
            e++;
        }
        for (int i =0;i<nums.length;i++)
        {
            if (c!=0)
            {
                nums[i]=0;
                c--;
            }
            else if (d!=0)
            {
                nums[i]=1;
                d--;
            }
            else if (e!=0)
            {
                nums[i]=2;
                e--;
            }
        }
        System.out.println (Arrays.toString(nums));
        
    }
}