class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int c=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() && s.charAt(i)=='(') st.push(s.charAt(i));
            else if( !st.isEmpty() && s.charAt(i)==')'&& st.peek()=='(' ) st.pop();
            else if(st.isEmpty() && s.charAt(i)==')') c++;
            else{
                st.push(s.charAt(i));
            }
        }
        return c+st.size();
    }
}