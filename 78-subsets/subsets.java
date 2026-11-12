class Solution {
    public void sub(int[] nums, int idx, List<Integer> temp, List<List<Integer>> ans) {
        if (idx >= nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        sub(nums, idx + 1, temp, ans);
        temp.remove(temp.size() - 1);
        sub(nums, idx + 1, temp, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sub(nums, 0, temp, ans);
        return ans;
    }
}