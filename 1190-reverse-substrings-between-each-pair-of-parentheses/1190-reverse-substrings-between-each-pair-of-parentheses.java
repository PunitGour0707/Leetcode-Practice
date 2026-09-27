class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        String ans = "";
        String cur = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            cur = "";
            if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    cur += st.pop();
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
            ans+=st.pop();
        }
        return new StringBuilder(ans).reverse().toString();
        
    }
}