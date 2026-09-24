class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        int s1=0;
        int s2=0;
        while(i>=0 || j>=0)
        {
            while(i>=0)
            {
                if(s.charAt(i)=='#')
                {
                s1++;
                i--;
                 }
               else if(s1>0)
                {
                s1--;
                i--;

                 }
                 else
                {
                break;
                }
            }
            while(j>=0)
            {
                if(t.charAt(j)=='#')
                {
                s2++;
                j--;
                }
                else if(s2>0)
                {
                s2--;
                j--;
                 }
                 else
                 {
                break;
                 }
            }
            if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j))
            {
                return false;
            }
            if(i>=0 && j<0)
            {
                return false;
            }
            if(j>=0 && i<0)
            {
                return false;
            }
            i--;
            j--;
        }
        return true;

    }
}