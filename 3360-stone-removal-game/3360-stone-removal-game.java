class Solution {
    public boolean canAliceWin(int n) {
        int x=10;
        boolean ans=false;
        while(n>=x ){
            n-=x;
            x--;
            ans=(!ans);
        }
        return ans;
    }
}