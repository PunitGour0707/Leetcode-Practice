class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n=arr.length;
        String ans=arr[0];
        for(int i=1;i<n;i++){
            String cur=arr[i];
            int j=0;
            while(j<ans.length()&& j<cur.length()&&ans.charAt(j)==cur.charAt(j)){
                j++;
            }
            ans=ans.substring(0,j);
            if(ans=="") return "";
        }
        return ans;
        
    }
}