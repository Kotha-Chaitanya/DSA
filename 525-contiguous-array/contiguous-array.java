class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int s=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            s--;
            else if(nums[i]==1)
            {
              s++;
            }
            if(map.containsKey(s))
            {
                max=Math.max(max,i-map.get(s));
            }
            else
            {
            map.put(s,i);
            }
        }
        return max;
    }
}