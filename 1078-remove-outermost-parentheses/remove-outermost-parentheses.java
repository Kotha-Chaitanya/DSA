class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        int i = 0;
        String ans = "";

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '(') {
                c++;
            }
            else if (s.charAt(j) == ')') {
                c--;

                if (c == 0) {
                    ans = ans + s.substring(i + 1, j);
                    i = j + 1;
                }
            }
        }

        return ans;
    }
}