class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        while(n>0){
            long d=n%10;
            if(d!=0) x=x*10+d;
            n=n/10;
        }
        long xrev=0;
        while(x>0){
            xrev=xrev*10+x%10;
            sum+=x%10;
            x=x/10;
        }
        return xrev*sum;
    }
}