class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
            int r=s%k;
            if(map.containsKey(r))
            {
                if(i-map.get(r)>=2)
                return true;
            }
            if(!map.containsKey(r))
            map.put(r,i);
        }
        return false;
    }
}