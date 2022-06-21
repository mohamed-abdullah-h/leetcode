class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int temp;
      char[]chars = columnTitle.toCharArray();
        int len = chars.length-1;
        for(int  i = 0; i<chars.length; i++){
            temp = chars[i]-64;
            result += Math.pow(26,len)*temp;
            --len;
        }
        return result;
    }
}