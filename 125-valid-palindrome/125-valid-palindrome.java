class Solution {
    public boolean isPalindrome(String s) {
      if(s== null || s.isBlank()||s.length()==1) return true;
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        System.out.println(s);
        s = s.trim();
        if (s.isEmpty())return true;
        int revers = s.length()-1;
        for(int i = 0; i< s.length();i++){
            if(i >= revers)return true;
            if(s.charAt(i) != s.charAt(revers--)){
                return false;
            }
        }
        return false;
    }
}