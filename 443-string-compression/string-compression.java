class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int c=0;
        String k="";
        while(j<chars.length)
        {
            while(j<chars.length && chars[i]==chars[j])
            {
                j++;
                c++;
            }
            if(c>1)
            {
                k=k+chars[i]+c;
                i=j;
                c=0;
            }
            else
            {
                k=k+chars[i];
                i=j;
                c=0;
            }
          
        }
        for(int m=0;m<k.length();m++)
        {
            chars[m]=k.charAt(m);
        }
        return k.length();
      
    }
}