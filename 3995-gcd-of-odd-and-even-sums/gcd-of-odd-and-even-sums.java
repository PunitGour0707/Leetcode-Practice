class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}