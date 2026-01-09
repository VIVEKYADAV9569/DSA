class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int la=0;
        int ra=0;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            if(la<height[l]){
                la=Math.max(la,height[l]);
            }
            else if(ra<height[r]){
                ra=Math.max(ra,height[r]);
            }
            else if(la<ra){
                ans+=la-height[l];
                l++;
            }
            else{
                ans+=ra-height[r];
                r--;
            }
        }
        return ans;
    }
}