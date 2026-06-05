class Solution {
    public int[] twoSum(int[] arr, int t) {
        int[] ans =new int[2];
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int cur=t-arr[i];
            if(!mp.isEmpty() && mp.containsKey(cur)){
                ans[0]=mp.get(cur);
                ans[1]=i;
                return ans;
            }
            mp.put(arr[i],i);
        }
        ans[0]=-1;
                ans[1]=-1;
                return ans;
    }
}