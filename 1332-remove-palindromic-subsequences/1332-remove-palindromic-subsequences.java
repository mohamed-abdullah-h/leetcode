class Solution {
    public int removePalindromeSub(String s) {
       int z = s.length()-1;
        for (int i = 0; i< s.length();i++){
            if (i >= z) return 1;
            if (s.charAt(i) != s.charAt(z--)){
                return 2;
            }
        }
        return 1;
    }
     
}