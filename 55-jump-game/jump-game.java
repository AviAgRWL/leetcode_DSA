class Solution {
    public boolean canJump(int[] nums) {
        boolean a [] = new boolean [nums.length];
        int b=0;
        Arrays.fill(a,false);
        a[0]=true;

        for (int i =0;i<nums.length;i++)
        {
            b=1;
            if(a[i]!=true)
            return false;
            while(b<=nums[i])
            {
                if (b+i>=nums.length)
                break;
                a[b+i]=true;
                b++;

            }


        }
        if(a[nums.length-1])
        return true;
        else 
        return false;
        
    }
}