class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int res=0;
        HashMap<Integer , Integer> m = new HashMap <Integer , Integer>();
        for (int i =0;i<nums.length;i++)
        {
            if (m.containsKey (nums[i]))
            {
                res=m.get(nums[i]);
                if (Math.abs(i-res)<=k)
                return true;
                else 
                m.put(nums[i],i);
            }
            else 
            m.put(nums[i], i );


        }
        return false;
        
            
            

        
        
    }
}