class Solution {
    public String simplifyPath(String s) {
        int n=s.length();
        Stack<String> st=new Stack<>();
        int i=0;
        while(i<n){
            StringBuilder sb=new StringBuilder("");
            while(i<n && s.charAt(i)=='/')i++;
            int cnt=0;
            while(i<n && s.charAt(i)!='/'){
                sb.append(s.charAt(i));
                if(s.charAt(i)=='.')cnt++;
                i++;
            }
            if(cnt==1 && sb.length()==1)continue;
            if(st.isEmpty() && cnt==sb.toString().length() && cnt==2)continue;
            if(cnt==sb.toString().length() && cnt==2 && !st.isEmpty())st.pop();
            else st.push(sb.reverse().toString());

        }
        StringBuilder ans=new StringBuilder("");
        while(!st.isEmpty()){
            ans.append(st.pop());
            if(ans.length()>0)ans.append('/');
        }
        if(ans.toString().length()==0)return "/";
        return ans.reverse().toString();

    }
}