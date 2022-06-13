class Solution {
    public int mySqrt(int x) {
      if (x==0)return 0;
    long n = 2147483647;
    long l = n;

    while (x <= (n*n)){
        n=n/2;
    }
    long z = (int)n;
    long sqr = z*z;
    for (long i =0; i < l; i++){
        if (sqr == x) return (int)z;
        else if (sqr > x) return(int) z-1;
            z++;
        sqr = z*z;
        }
        return (int)z;
    }
    }
