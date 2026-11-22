class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        boolean a=false;
        boolean b=false;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='b' && a)return false;
            if(s.charAt(i)=='b')b=true;
            if(s.charAt(i)=='a')a=true;
        }
        return true;
    }
}