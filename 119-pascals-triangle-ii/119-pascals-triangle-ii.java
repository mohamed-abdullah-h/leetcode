class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        all.add(l);
        if (rowIndex == 0) {
            return all.get(0);
        }
        List<Integer> temp = null;
        for (int i = 1; i < rowIndex+1; i++){

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
        return all.get(all.size()-1);
    }
}