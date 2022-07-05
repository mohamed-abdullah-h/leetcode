class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
        int sLen = s.length();
        int result = 0;
        int temp = 0;
        int valid_position = 0;
        for (int i = 0; i < sLen; i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                int index = map.get(c);
                if (valid_position <= index){
                    valid_position = index+1;
                     if (result < (i-index) ||result < temp){
                        result = Math.max((i-index),temp);
                    }
                    temp=i-valid_position;
                }
            }
            map.put(c,i);
            ++temp;
        }
        return Math.max(result, temp);
    
    }
}