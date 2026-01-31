class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),ans);
        return ans;
    }
    static void backtrack(int n,int k,int index,List<Integer>li,List<List<Integer>> ans){
        if(li.size()==k){
            ans.add(new ArrayList<>(li));
            return ;
        }
        for(int i=index;i<=n;i++){
            li.add(i);
            backtrack(n,k,i+1,li,ans);
            li.remove(li.size()-1);
        }
    }
}