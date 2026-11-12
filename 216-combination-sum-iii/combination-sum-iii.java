class Solution {
    public void sub(int n, int k, int idx, int sum,List<Integer> temp, List<List<Integer>> ans) {
        if (temp.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (idx > 9 || sum > n) {
            return;
        }
        temp.add(idx);
        sub(n, k, idx + 1, sum + idx, temp, ans);
        temp.remove(temp.size() - 1);
        sub(n, k, idx + 1, sum, temp, ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sub(n, k, 1, 0, temp, ans);
        return ans;
    }
}