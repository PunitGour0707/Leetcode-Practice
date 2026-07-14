class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        HashSet<Integer> st=new HashSet<>();
        for(int x:arr){
            st.add(x);
        }
        for(int i=1;i<=n;i++){
            if(!st.contains(i))return i;
        }
        return n+1;
    }
}