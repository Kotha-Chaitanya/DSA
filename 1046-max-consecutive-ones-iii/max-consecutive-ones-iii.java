class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            int x=k;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==1)
                {
                    c++;
                }
                else if(nums[j]==0 && x>0)
                {
                    c++;
                    x--;;
                }
                else
                {
                    
                    break;
                }
                len=Math.max(len,c);
            }
        }
        return len;
    }
}