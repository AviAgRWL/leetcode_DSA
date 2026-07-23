/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left=1,right=n,mid=0,k=0;
        
        while(left<=right)
        {
            mid=(left+right)/2;
            if (isBadVersion((int)mid))
            {
                right=mid-1;
                k=mid;
            }
            else left=mid +1;

        }
        return (int)k ;
        
    }
}