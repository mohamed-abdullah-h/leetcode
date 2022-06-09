class Solution {
    public boolean isPalindrome(int n) {
          if (n<0)return false;
        String s =String.valueOf(n);
        int last = s.length()-1;
        for (int i = 0; i< s.length(); i++){
            if (last<=i)return true;
            if (s.charAt(i) != s.charAt(last--)){
                return false;
            }
        }
        return true;
    }
}