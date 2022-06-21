class Solution {
    public String convertToTitle(int columnNumber) {
      char c;
        if (columnNumber <= 26){
            c= (char)(columnNumber+64);
            return ""+c;
        }
        String result = "";
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int num = columnNumber;
        int mod;
        while (num > 26){
            mod = (int) (num % 26);
            if (mod == 0){
                stack.push(26);
                num-=1;
            }
            else {
                stack.push(mod);
            }
            num = num/26;
        }

        c = (char)(num+64);
        result = result.concat(""+c);
        while (!stack.isEmpty()){
            num = stack.pop()+64;
            c = (char) num;
            result = result.concat(""+c);
        }

        return result;
    }
}