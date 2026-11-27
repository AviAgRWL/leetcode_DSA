class Solution {
    public int[][] generateMatrix(int n) {
        int [] [] res = new int[n][n];
        int top = 0, bottom = res.length - 1;
        int left = 0, right = res[0].length - 1;
        int a =1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                res[top][i]=a;a++;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                res[i][right]=a;a++;
            }
            right--;

            if (top <= bottom) {
                // Bottom row
                for (int i = right; i >= left; i--) {
                    res[bottom][i]=a;a++;;
                }
                bottom--;
            }

            if (left <= right) {
                // Left column
                for (int i = bottom; i >= top; i--) {
                   res[i][left]=a;a++;
                }
                left++;
            }
        }
        return res;
    

        
    }
}