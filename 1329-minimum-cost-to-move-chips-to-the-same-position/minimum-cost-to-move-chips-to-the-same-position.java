class Solution {
    public int minCostToMoveChips(int[] position) {
        int m =0,c=0;
        for (int i =0;i<position.length;i++)
        {
            if(position[i]%2==0)
            c++;
            else
            m++;
        }
        if (c>m)
        return m ;
        else return c ;
    }
}