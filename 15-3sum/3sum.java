class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1;
            int j=nums.length-1;
            while(left<j)
            {
            int s=(nums[i]+nums[left]+nums[j]);
            if(s==0)
            {
                List<Integer> list1=new ArrayList<>();
                list1.add(nums[i]);
                list1.add(nums[left]);
                list1.add(nums[j]);
                list.add(list1);
                left++;
                j--;
            
             while(left<j && nums[left]==nums[left-1])
            {
                left++;
            }
            while(left<j && nums[j]==nums[j+1])
            {
                j--;
            }
            }
            else if(s<0)
            left++;
            else if(s>0)
            j--;

            }
        }
        return list;
    }
}