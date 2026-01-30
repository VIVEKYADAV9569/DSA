class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch=s.toCharArray();
        List<Character>li=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            if(ch[i]!=' '){
                li.add(ch[i]);
            }
            else if(!li.isEmpty()){
                break;
            }
        }
        return li.size();
    }
}