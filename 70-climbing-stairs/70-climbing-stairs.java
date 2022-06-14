class Solution {
    public int climbStairs(int n) {
         if (n <=2 ) return n;
      int [] arr = new int [n];
        for (int i = 0; i < n; i++){
            arr[i] = 0;
        }
        arr[1] = 1;
        arr[2] = 2;
        return climbStairs(n,arr);
    }
    public int climbStairs(int n,int [] arr) {
       
        int f = 0;
        int l = 0;
        if (arr[n-1] !=0){
            f = arr[n-1];
        }
        else {
            f=climbStairs(n-1,arr);
            arr[n-1] = f;
        }
        if (arr[n-2] != 0){
           l = arr[n-2];
        }
        else {
            l=climbStairs(n-2,arr);
            arr[n-2] = l;
        }
        return f + l;
    }
}