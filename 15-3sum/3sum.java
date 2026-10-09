class Solution {
public List<List<Integer>> threeSum(int[] nums) {
Arrays.sort(nums);
List<List<Integer>> list = new ArrayList<>();
HashSet<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        int left = i + 1;
        int j = nums.length - 1;

        while (left < j) {
            int s = nums[i] + nums[left] + nums[j];

            if (s == 0) {
                List<Integer> temp = Arrays.asList(nums[i], nums[left], nums[j]);

                if (!set.contains(temp)) {
                    list.add(temp);
                    set.add(temp);
                }

                left++;
                j--;
            } 
            else if (s < 0) {
                left++;
            } 
            else {
                j--;
            }
        }
    }

    return list;
}


}
