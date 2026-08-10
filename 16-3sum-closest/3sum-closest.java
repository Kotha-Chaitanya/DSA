class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int s=nums[i]+nums[left]+nums[right];
                if(s==target)
                return s;
                else if(Math.abs(target-s)<Math.abs(target-closest))
                {
                    closest=s;
                }
                else if(s<target)
                left++;
                else
                right--;

            }
        }
        return closest;
    }
}