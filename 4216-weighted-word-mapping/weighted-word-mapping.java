class Solution {
    public String mapWordWeights(String[] arr, int[] w) {
        int n=arr.length;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            String s=arr[i];
            int m=s.length();
            int x=0;
            for(int j=0;j<m;j++){
               x+=w[s.charAt(j)-'a'];
            }
            x=x%26;
            x=25-x;
            sb.append((char)(x+'a'));
        }
        return sb.toString();
    }
}