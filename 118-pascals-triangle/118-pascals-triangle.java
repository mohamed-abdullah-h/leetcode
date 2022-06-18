class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        all.add(l);
        if (numRows == 1) {
            return all;
        }
        List<Integer> temp = null;
        for (int i = 1; i < numRows; i++){

            l = new ArrayList<>();
            l.add(1);
            temp = all.get(i-1);
            for (int z = 0; z < i-1;z++){
                int x = temp.get(z) + temp.get(z+1);
                l.add(x);
            }
            l.add(1);
            all.add(l);
        }
        return all;
    }
}