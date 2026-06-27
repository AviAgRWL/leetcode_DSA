class NumArray {
int []b;
    public NumArray(int[] nums) {
        int a =0;
        for (int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]+a;
            a=nums[i];
             }
             b=nums;
        
    }
    
    public int sumRange(int left, int right) {
        if (left==0)
        return b[right];
        else
        return b[right]-b[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */