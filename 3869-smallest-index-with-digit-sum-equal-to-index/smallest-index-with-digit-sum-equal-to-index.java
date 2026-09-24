class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                if(i==nums[i])
                {
                    return i;
                }
            }
            else 
            {
               int s=0;
               while(nums[i]>0)
               {
                int d=nums[i]%10;
                s=s+d;
                nums[i]=nums[i]/10;
               }
               if(i==s)
               {
                return i;
               }

            }
        }
        return -1;
    }
}