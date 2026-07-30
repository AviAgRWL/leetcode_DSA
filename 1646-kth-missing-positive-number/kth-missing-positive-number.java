class Solution {
    public int findKthPositive(int[] arr, int k) {
       int m =1;
        for (int i =0;i<arr.length;i++)
        {
            if (m!=arr[i])
            {
                k--;
                
                i--;
                if (k==0)
                return m;
               

            }
            m++;
            
             }
             if (k!=0)
            
                return (arr[arr.length-1]+k);
               

           return -1; 
        
    }

}