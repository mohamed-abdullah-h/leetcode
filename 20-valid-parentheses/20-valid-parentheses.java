class Solution {
    public boolean isValid(String s) {
       if (s.length()%2 !=0)return false;
        LinkedList<Character> ln = new LinkedList<>();
        for ( char c: s.toCharArray()) {
            if (c == '(' || c =='{' || c == '['){
                ln.addFirst(c);
            }
            else {
                if (ln.size() == 0)return false;
                if (c == '}'){
                    if (ln.pop() != '{') return false;
                }
                else if(c == ']'){
                    if (ln.pop() != '[') return false;
                }
                else {
                    if (ln.pop() != '(') return false;
                }
            }
        }
        if (ln.isEmpty())
        return true;
        return false;
    }
}