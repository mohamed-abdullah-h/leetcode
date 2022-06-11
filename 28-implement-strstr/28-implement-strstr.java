class Solution {
    public boolean check(String stack,String needle,int index){
        int z = 1;
        for (; z < needle.length() && index < stack.length(); z++){
            if (needle.charAt(z) != stack.charAt(index++)){
                return false;
            }
        }
        if (z < needle.length()) return false;
        return true;
    }
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())return 0;
        int index =-1;
        int n_index = 0;
       for (int i = 0; i<haystack.length();i++){
           if (haystack.charAt(i) == needle.charAt(n_index)){
               if (check(haystack,needle,i+1)){
                   return i;
               }
           }
       }
        return index;
    }
}