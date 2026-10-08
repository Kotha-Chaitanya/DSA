class Solution {
    public String compressedString(String s) {
        int i=0;
        int j=0;
        int c=0;
        String k="";
        while(j<s.length())
        {
            while(j<s.length() && s.charAt(i)==s.charAt(j))
            {
                j++;
                c++;
            }

             while (c > 9) {
                k = k + "9" + s.charAt(i);
                c = c - 9;
            }
            
            k=k+c+s.charAt(i);
            
            i=j;
            c=0;
        }
        return k;
    }
}