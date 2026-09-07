class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int c=0,a=0;
        for (int i =0;i<worker.length;i++)
        {
            a=0;
            for (int j=0;j<difficulty.length;j++)
            {

                if (worker[i]>=difficulty[j])
                {
                    if(a<profit[j])
                    a=profit[j];
                }
                

            }
            c+=a;
        }
        return c;
        
    }
}