class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int low=0,high=0;//cnt ki jagah range maintain karke chalo for all feasible solutions i.e. values
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                low++;high++;
            }
            else if(s.charAt(i)==')'){
                low--;
                high--;
            }
            else{
                low-=1;
                high+=1;
            }
            if(low<0) low=0;
            if(high<0) return false;

        }
        return (low == 0);
    }
}