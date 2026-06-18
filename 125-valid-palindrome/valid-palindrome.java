class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        String sn = s.toLowerCase();
        while (i < n && j >= 0) {
            if (((sn.charAt(i) >= 48 && sn.charAt(i) <= 57) || (sn.charAt(i) >= 97 && sn.charAt(i) <= 122))
                    && ((sn.charAt(j) >= 48 && sn.charAt(j) <= 57) || (sn.charAt(j) >= 97 && sn.charAt(j) <= 122))) {
                if (!(sn.charAt(i) == sn.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
            if (i < n && j >= 0) {
                if (!((sn.charAt(i) >= 48 && sn.charAt(i) <= 57) || (sn.charAt(i) >= 97 && sn.charAt(i) <= 122)))
                    i++;
                if (!((sn.charAt(j) >= 48 && sn.charAt(j) <= 57) || (sn.charAt(j) >= 97 && sn.charAt(j) <= 122)))
                    j--;
            }
        }
        return true;
    }
}