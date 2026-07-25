class Solution {
    public int hIndex(int[] citations) {
        int left=0,right=citations.length-1,mid=0,k=0,n=citations.length;
        if(citations.length==1)
        {
            if (citations[0]==0)
            return 0;
            else 
            return 1;
        }
         while (left<=right)
         {
              mid = left + (right - left) / 2;

    if (citations[mid] >= n - mid) {
        right = mid - 1;      // search for an earlier valid index
    } else {
        left = mid + 1;
    }
}

         
         return n-left;
 }
}