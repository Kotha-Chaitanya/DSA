class Solution {
    public boolean validateStackSequences(int[] s, int[] t) {
        int i = 0;
        int j = 0;
        Stack<Integer> st = new Stack<>();
        while (i < s.length) {
            st.push(s[i]);
            i++;
            while (!st.isEmpty() && j < t.length && st.peek() == t[j]) {
                st.pop();
                j++;
            }
        }
        return j == t.length;
    }
}