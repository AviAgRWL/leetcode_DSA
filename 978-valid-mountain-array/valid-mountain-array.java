class Solution {
    public boolean validMountainArray(int[] arr) {
        int left=0,right=0;
        if(arr.length<=2)
        return false;
        for (int i =1;i<arr.length;i++)
        {
            if (arr[i-1]>arr[i])
            {
            left=i-1;
            break;
            }

            else if (arr[i-1]==arr[i])
            return false;
            


        }
        if (left==0)
        return false;
         for (int i =arr.length-1;i>0;i--)
        {
            if (arr[i-1]<arr[i])
            {
            right=i;
            break;
            }
            else if (arr[i-1]==arr[i])
            return false;



        }
        if(left==right)
        return true;
        else 
        return false;
        
        
    }
}