class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
            int current=Math.min(height[r],height[l])*(r-l);
            max=Math.max(max,current);
            if(height[l]<height[r]){l++;}
            else {r--;}
        }

return max;
    }
}