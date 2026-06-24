class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }
    public void solve(String curs,int open,int cl,int n,List<String> ans){
        if(curs.length()==2*n){
            ans.add(curs);
            return;
        }
        if(open<n){
            solve(curs+'(',open+1,cl,n,ans);
        }
        if(cl<open){
            solve(curs+')',open,cl+1,n,ans);
        }
    }
}