class Solution {
    public int calc(int n){
        int ans=0;
        while(n>0){
            ans+=(n%10)*(n%10);
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int s;
        int cnt=0;
        int d;
        HashMap<Integer,Integer> mp= new HashMap<>();
        while(n!=1){
            if(!mp.isEmpty() && mp.containsKey(n)){
                return false;
            }
            mp.put(n,1);
            n=calc(n);
        }
        return true;
    }
}