class Solution {
    public int singleNumber(int[] nums) {
        // https://github.com/VIVEKYADAV9569/DSA
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c ^= nums[i];
        }
        return c;

    }
}