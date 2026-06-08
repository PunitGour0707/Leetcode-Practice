class Solution {
    public int maxProfit(int[] arr) {
      int n=arr.length;
      int maxprofit=0;
      int minprice=arr[0];
      for(int i=1;i<n;i++){
            if(arr[i]<minprice) minprice=arr[i];
            int profit=arr[i]-minprice;
            if(profit>maxprofit) maxprofit=profit;

      }
      return maxprofit;
    }
}