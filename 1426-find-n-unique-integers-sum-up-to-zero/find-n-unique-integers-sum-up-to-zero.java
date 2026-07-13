class Solution {
    public int[] sumZero(int n) {
        int a[]= new int [n];
        int c=n;
        int b=1;
        if (n%2!=0)
        {
          c--;
        }
        for (int i =0;i<c;i++)
        {
            a[i]=b;
            a[i+1]=-b;
            b++;
            i++;
        }
        if (n%2!=0)
        a[n-1]=0;
        return a;
    }
}