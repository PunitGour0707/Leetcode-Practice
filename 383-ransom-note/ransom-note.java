class Solution {
    public boolean canConstruct(String r, String m) {
        int x=r.length();
        int y=m.length();
        int[] hash=new int[26];
        for(int i=0;i<y;i++){
            hash[m.charAt(i)-97]++;
        }
        for(int i=0;i<x;i++){
            hash[r.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(hash[i]<0) return false;
        }
        return true;
    }
}