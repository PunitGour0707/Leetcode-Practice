class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            if(mp.get(arr[i])==3) mp.remove(arr[i]);
        }
        int ans=0;;
        for(Integer i:mp.keySet()){
            ans=i;
        }
        return ans;
        
    }
}