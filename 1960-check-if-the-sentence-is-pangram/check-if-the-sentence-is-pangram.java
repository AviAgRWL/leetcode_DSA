class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] b = new boolean [26];
        char c = ' '; int m =0;
        Arrays.fill(b, false);
        if (sentence.length()<26)
        return false;
        for (int i =0;i<sentence.length();i++)

        {
            c=sentence.charAt(i);
            
            b[c-97]=true;

            

            
        }
        for (int i =0;i<b.length;i++){
            if (b[i]==false)
            return false;
        }
        return true;
        
    }
}