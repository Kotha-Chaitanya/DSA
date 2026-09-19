class Solution {
    public int calPoints(String[] arr) {
        Stack< Integer >st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("C"))
            {
                st.pop();
            }
            else if(arr[i].equals("D"))
            {
                int num=st.peek();
                st.push(num*2);
            }
           else  if(arr[i].equals("+"))
            {
                int num1=st.pop();
                int num2=st.peek();
                int num3=num1+num2;
                st.push(num1);
                st.push(num3);

            }
            else
            {
                st.push(Integer.parseInt(arr[i]));
            }
        }
        int s=0;
        while (!st.isEmpty()) {
            s = s + st.peek();
            st.pop();
        }
        return s;
    }
}