class Solution {
    public int pivotIndex(int[] nums) {
        int ts=0;
        for(int i=0;i<nums.length;i++)
        {
            ts=ts+nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++)
        {
        int rs=ts-ls-nums[i];
        if(ls==rs)
        return i;
        ls=ls+nums[i];
        }
        return -1;
    }
}