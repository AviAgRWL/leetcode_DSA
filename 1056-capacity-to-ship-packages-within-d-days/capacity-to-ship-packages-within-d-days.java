class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0,sum=0,k=0,m=0;
        long mid =0;
        for (int i =0;i<weights.length;i++){
        right+=weights[i];
        if (weights[i]>left)
        left=weights[i];
    }
        
        
        while (left<=right)
        {
            k=1;sum=0;
            mid=left+((right-left)/2);
            for (int i =0;i<weights.length;i++)
            {
                if ((sum+weights[i])<=(int)mid )
                sum+=weights[i];
                else{
                sum=0;
                sum+=weights[i];
                k++;


            }

        }
        if (k<=days)
        {
            m=(int)mid;
            right=(int)mid-1;
        }
        else if (k>days)
        left=(int)mid+1;
        
        
    }
    return m;
}
}