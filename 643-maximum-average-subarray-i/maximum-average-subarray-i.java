class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double s=0;
        double max=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            s=s+nums[right];
            if(right-left+1==k)
            {
                double avg=s/k;
                max=Math.max(max,avg);
                s=s-nums[left];
                left++;
            }
        }
        return max;
    }
}