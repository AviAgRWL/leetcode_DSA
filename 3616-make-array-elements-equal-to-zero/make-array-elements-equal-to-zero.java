class Solution {
    public int countValidSelections(int[] nums) {
        int sum=0,c=0,left=0,right=0;
        int a[] =nums.clone();
        for(int i=0;i<nums.length;i++)
        {
            sum+=a[i];
            a[i]=sum;
        }
        if (sum==0)
        {
        return 2*nums.length;
        }
        if (nums.length==1)
        return 0;
        for (int i =0;i<nums.length;i++)
        
        {
            if (nums[i]==0)
            {
                if (i==0)
                {
                left=0;
                right=a[a.length-1]-a[i];}
                else if(i==nums.length-1){
                right=0;
                left=a[i-1];
                }
                else{
                    right=a[a.length-1]-a[i];
                    left=a[i-1];
                }

            
            if (left==right)
            c=c+2;
            else if (Math.abs(right-left)==1)
            c++;
            }
        }
        return c;
        
    }
}