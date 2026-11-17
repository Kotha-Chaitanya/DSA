class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        f(nums,0,temp,ans);
        return ans;
    }
    public void f(int []nums,int i, List<Integer>temp, List<List<Integer>>ans)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[i]);
        f(nums,i+1,temp,ans);
        temp.remove(temp.size()-1);
        f(nums,i+1,temp,ans);


    }

}