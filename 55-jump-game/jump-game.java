class Solution {
    public boolean canJump(int[] arr) {
        int n=arr.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(i>maxi) return false;
            maxi=Math.max(maxi,i+arr[i]);
        }
        return true;
    }
}