class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int c=0;
        int max=0;
        for(int right=0;right<s.length();right++)
        {
            if(isVowel(s.charAt(right)))
            {
                c++;
            }
            if(right-left+1==k)
            {
                max=Math.max(max,c);
                if(isVowel(s.charAt(left)))
                {
                    c--;
                }
                left++;
            }
        }
        return max; 
    }
    public boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I'|| c=='O' || c=='U' )
        {
            return true;
        }
        return false;
    }
}