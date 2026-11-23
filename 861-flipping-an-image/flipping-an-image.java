class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int a=0;                                        
        for (int i =0 ;i<image.length;i++)
        {
            for (int j =0;j<image[i].length/2;j++)
            {
                a=image[i][j];
                image[i][j]=image[i][(image[i].length-1)-j];
                image[i][(image[i].length-1)-j]=a;


            }
            for (int k=0;k<image[i].length;k++)
            {
                if (image[i][k]==0)
                image[i][k]=1;
                else
                image[i][k]=0;

            }
        }
        return image;
    }
}