class Solution {
    public int arrangeCoins(int n) {
        long k=0;
        for (long i =1;i<=n;i++)
        {
            if ((i*(i+1))/2==n)
            return (int)i;
            else if ((i*(i+1))/2>n)
            {
            k=i;
            break;
            }

            
        }
        return (int )k-1;
        
    }
}