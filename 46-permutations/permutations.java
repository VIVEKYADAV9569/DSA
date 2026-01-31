class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permute(nums,new ArrayList<>(),ans);
        return ans;
    }
    static void permute(int[] nums,List<Integer>li,List<List<Integer>> ans){
        if(li.size()==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(li.contains(nums[i]))continue;
            li.add(nums[i]);
            permute(nums,li,ans);
            li.remove(li.size()-1);
        }
    }
}