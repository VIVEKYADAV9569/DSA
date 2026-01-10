class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int ans=0;
        while(x>0){
            int d=x%10;
            ans=ans*10+d;
            x/=10;
        }
        if(ans==a)return true;
        else return false;
    }
}