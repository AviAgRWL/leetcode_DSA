class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        for(int i =digits.length-1;i>=0;i--)
        {
            if (digits[i]+1<=9){
            digits[i]=digits[i]+1;
            
            break;
            }
            else if (digits[i]+1==10){
            digits[i]=0;;
            
            continue;
            }
            else continue ;
        }
        if (digits[0]==0)
        {
            int a []=new int [digits.length+1];
            a[0]=1;
            for (int i =1;i<a.length;i++)
            {
                a[i]=0;
            }
            return a;
        }
else 
return digits;
            

            

            }

        }
        
    
