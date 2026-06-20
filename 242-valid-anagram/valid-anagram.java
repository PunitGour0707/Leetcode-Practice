class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[] hash=new int[26];
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++){
            hash[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(hash[i]!=0) return false;
        }
        return true;
    }
}