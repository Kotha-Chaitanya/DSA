class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList();
        f(nums,0,temp,ans);
        return ans;
    }
    public void f(int []nums,int id,List<Integer>temp,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(temp));
        for(int i=id;i<nums.length;i++)
        {
            if(i>id && nums[i]==nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            f(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}