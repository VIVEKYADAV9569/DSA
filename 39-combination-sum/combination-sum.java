class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
       combi(candidates,target,0,new ArrayList<>(),ans);
       return ans;
    }
    static void combi(int[] candidates,int target,int index,List<Integer>li,List<List<Integer>> ans){
          if(target==0){
            ans.add(new ArrayList<>(li));
            return;
          }
          for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target){
                continue;
            }
            li.add(candidates[i]);
            combi(candidates,target-candidates[i],i,li,ans);
            li.remove(li.size()-1);
          }
    }
}