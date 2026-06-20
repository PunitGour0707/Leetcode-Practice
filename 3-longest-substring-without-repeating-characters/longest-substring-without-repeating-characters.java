class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0)
            return 0;
        int ans = 1;
        int l = 0;
        int r = 0;
        HashSet<Character> mp = new HashSet<>();
        while (r < n) {
            while(mp.contains(s.charAt(r))){
                mp.remove(s.charAt(l));
               l++;
            } 
            ans=Math.max(ans,r-l+1);
            mp.add(s.charAt(r));
            r++;
        }
        return ans;
    }
}