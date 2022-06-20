class MinStack {

    private Deque<Integer> deque = new ArrayDeque<>();
    private Comparator<Integer> cmp = (i,j)->{if (i > j) return i; return j;};
    public ArrayList<Integer> list = new ArrayList<>();
    
    public void push(int val) {
     deque.push(val);
     list.add(val);
     Collections.sort(list);
    }

    public void pop() {
        int i = deque.pop();
        list.remove((Object)i);
         Collections.sort(list);
    }

    public int top() {
     return deque.peek();
    }

    public int getMin() {
        return list.get(0);
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */