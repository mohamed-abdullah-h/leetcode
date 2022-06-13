class Solution {
    public int lengthOfLastWord(String s) {
         int l = s.length()-1;
        int count = 0;
        for (int  i = l; i >=0; i--){
            if (s.charAt(i) == ' '){
                if (count > 0){ break;}
            }else{
               count++;
            }
        }
        return count;
    }
}