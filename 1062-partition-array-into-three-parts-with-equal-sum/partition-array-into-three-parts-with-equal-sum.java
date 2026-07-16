class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int a=0,k=0,b=0,c=0,m=0;
        for (int i =0;i<arr.length;i++)
        {
            
            a+=arr[i];
        }
        
        if (a%3==0)
        k=a/3;
        else 
        return false;
        for (int i=0;i<arr.length;i++)
        {
            b+=arr[i];
            if (b==k)
            {
                b=0;
                c++;
            }
        }
       
        if (c>=3)
        return true;
        else 
        return false;
        
        
        
    }
}