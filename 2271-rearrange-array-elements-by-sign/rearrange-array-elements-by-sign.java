class Solution {
    public int[] rearrangeArray(int[] nums) {
       int a[]=new int [nums.length];
       int b=0,c=1;
        for (int i =0;i<nums.length;i++)
        {
            
            
            
                if (nums[i]>0)
                {
                a[b]=nums[i];
                b=b+2;
                }
                else {
                a[c]=nums[i];
                c=c+2;
                }

            }
            return a;
        }
    }
