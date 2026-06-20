class Solution {
    public int maxArea(int[] arr) {
      int max=0;
      int i=0;
      int j=arr.length-1;
      while(i<j){
        int height=Math.min(arr[i],arr[j]);
        int width=j-i;
        max=Math.max(max,height*width);
        if(arr[i]<=arr[j]) i++;
        else j--;
      }
      return max;
    }
}