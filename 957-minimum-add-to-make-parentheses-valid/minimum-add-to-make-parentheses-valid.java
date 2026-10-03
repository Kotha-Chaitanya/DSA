class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push('(');
            }
            else if(s.charAt(i)==')') 
            {
               
                if(st.isEmpty())
                {
                    c++;
                }
                else

                {
                     st.pop();
                }
            }
        }
        return c+st.size();
    }
}