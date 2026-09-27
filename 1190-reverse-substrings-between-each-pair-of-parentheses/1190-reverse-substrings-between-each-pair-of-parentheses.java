class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        // StringBuilder cur = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            StringBuilder cur=new StringBuilder("");
            if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    cur.append(st.pop());
                }
                st.pop();
            }
            for (int j = 0; j < cur.length(); j++) {
                st.push(cur.charAt(j));
            }
            if (s.charAt(i) != ')')
                st.push(s.charAt(i));
        }
        
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return  ans.reverse().toString();
        
    }
}