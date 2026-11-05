class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    ArrayList<Integer> al=new ArrayList<>();
    void find(int[] candidates,int target,int idx,ArrayList<Integer> al){
        if(idx>=candidates.length) return;
         if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(target<0)    return;
       
        al.add(candidates[idx]);
        find(candidates,target-candidates[idx],idx,al);
        al.remove(al.size()-1);
        find(candidates,target,idx+1,al);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates,target,0,al);
        return ans;
    }
}