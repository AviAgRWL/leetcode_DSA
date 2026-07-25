class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for (int i =0;i<arr.length;i++)
        {
            
            if (checkdouble(arr,arr[i]*2,i))
            return true ;

            
        }
        return false;
    }
    public boolean checkdouble(int[] a, int k,int m )
    {
        int left=0,right=a.length-1,mid=0;
        while(left<=right)
        {

            mid=left+((right-left)/2);
            
            
            if (a[mid]==k&& mid!=m)
            return true;
            else if(a[mid]>k)
            right=mid-1;
            else 
            left=mid+1;
        }
        return false;

    }
}