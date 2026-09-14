class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[128];
        int i=0;
        int len=0;
        for(int j=0;j<s.length();j++)
        {
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1)
            { 
                freq[s.charAt(i)]--;
                i++;
            }
            len=Math.max(len,j-i+1);
        }   
   return len;
    }
}