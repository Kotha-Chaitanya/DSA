class Solution {
    public void sub(int n, int k, int idx, List<Integer> temp, List<List<Integer>> ans) {
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (idx > n) {
            return;
        }
        temp.add(idx);
        sub(n, k, idx + 1, temp, ans);
        temp.remove(temp.size() - 1);
        sub(n, k, idx + 1, temp, ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sub(n, k, 1, temp, ans);
        return ans;
    }
}