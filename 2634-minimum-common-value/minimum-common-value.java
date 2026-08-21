class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int right1=nums1.length;
       int right2=nums2.length;
        int left1=0 ,left2=0;
        


        while (left1 < right1 && left2 < right2 )
        {
            if (nums1[left1]==nums2[left2])
            return nums1[left1];
            else if (nums1[left1]>nums2[left2])
            left2++;
             else if (nums1[left1] < nums2[left2])
             left1++;
             
        }
        return -1;
        
    }
}