class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left =0,right=nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> b= new ArrayList<>();
       
        for (int  i =0;i< nums.length;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            left=i+1;
            right=nums.length-1;
            while (left<right)
            {
                if (nums[left]+nums[right]+nums[i]==0)
                {
                     List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[left]);
                    a.add(nums[right]);
                    
                    b.add(a);
                    left++;right--;
                   while (left < right && nums[left] == nums[left - 1])
    left++;

while (left < right && nums[right] == nums[right + 1])
    right--;
                    
                }
                else if ((nums[left]+nums[right])>(-nums[i]))
                right--;
                else 
                left++;


            }

        }
          return b;
        
    }
  
} 
