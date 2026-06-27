class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int add=0;
        if (arr.length==1)
        return arr[0];
        for (int i =0;i<arr.length;i++)
        {
            add=add+arr[i];
            int sum=arr[i];
            for (int j =i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if ((j-i)%2==0)
                {
                add=add+sum;
                
                }
                

            }
        }
        return add;
        
    }
}