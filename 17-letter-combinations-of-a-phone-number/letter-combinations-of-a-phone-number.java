class Solution {
    public List<String> letterCombinations(String d) {
        int n=d.length();
        List<String> ans=new ArrayList<>();
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder("");
        solve(d,sb,0,arr, ans);
        return ans;
    }
    public void solve(String d,StringBuilder sb,int i,String[]arr,List<String> ans){
        if(i==d.length()){
            ans.add(sb.toString());
            return;
        }
        
        String cur=arr[d.charAt(i)-'0'];
        for(int j=0;j<cur.length();j++){
            sb.append(cur.charAt(j));
            solve(d,sb,i+1,arr,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}