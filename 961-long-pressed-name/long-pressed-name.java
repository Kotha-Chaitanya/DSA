class Solution {
    public boolean isLongPressedName(String s, String k) {
      int i=0;
      int j=0;
      while(j<k.length())
      {
        if(i<s.length() && s.charAt(i)==k.charAt(j))
        {
            i++;
            j++;
        }
        else if(i>0 && j<k.length() && k.charAt(j)==s.charAt(i-1))
        {
            j++;
        }
        else
        {
            return false;
        }
      }
      return i==s.length();

    }
}