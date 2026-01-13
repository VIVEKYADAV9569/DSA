class Solution {
    public String intToRoman(int num) {
        int[] Varr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] st={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<Varr.length&&num>0;i++){
            while(num>=Varr[i]){
                num=num-Varr[i];
                sb.append(st[i]);
            }
        }
        return sb.toString();
    }
}