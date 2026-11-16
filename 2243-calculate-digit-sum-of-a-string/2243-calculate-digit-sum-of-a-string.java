class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(s.length()>k){
            s=solve(s,k);
        }
        return s;
    }
    public String solve(String s,int k){
        int n=s.length();
        int i=0;
        StringBuilder sb=new StringBuilder("");
        while(i<n){
            String sub=s.substring(i,Math.min(i+k,n));
            sb.append(Integer.toString(sum(sub)));
            i+=k;
        }
        return sb.toString();
    }
    public int sum(String s){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(s.charAt(i)-'0');
        }
        return ans;
    }
}