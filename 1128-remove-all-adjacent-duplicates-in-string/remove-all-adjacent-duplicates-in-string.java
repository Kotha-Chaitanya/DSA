class Solution {
    public String removeDuplicates(String s) {
       Stack<Character>st=new Stack<>();
       for(int i=0;i<s.length();i++)
       {
        if(!st.isEmpty() && s.charAt(i)==st.peek())
        {
            st.pop(); 
        }
        else
        {
        st.push(s.charAt(i));
        }
       }
      String t="";
      for(int i=0;i<st.size();i++)
      {
        t=t+st.get(i);
      }
      return t;
    }
}