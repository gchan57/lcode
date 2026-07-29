class Solution {
    public double myPow(double a, int n) {
        if(n==0) return 1;
        if(n<0) {
            if(n==Integer.MIN_VALUE){
                return (1/a)*(1/myPow(a,-(n+1)));
            }
            return 1/myPow(a,-n);
        }
        double t=myPow(a,n/2);
        if(n%2==0)
        return t*t;
        else
        return a*t*t;
    }
}