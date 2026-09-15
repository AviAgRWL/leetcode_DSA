class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer  > m = new HashSet<Integer >();
        int a [] = new int [2];int b=0;
        for (int i=0 ; i<nums.length ; i++)
        {
            m.add(i+1 );
        }
        for (int i =0;i<nums.length;i++)
        {
            if (m.contains(nums[i]))
            {
                m.remove(nums[i]);
            }
            else 
            a[0]=nums[i];
             
             
        }
        for (Integer x : m)
        {
        a[1]=x;
        
        }
   
    
        
        return a;
    }
}