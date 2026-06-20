class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();
        int i=0;int j=0;
        while(j<=k && j<n){
          if(!hs.isEmpty() && hs.contains(arr[j])) return true;
          hs.add(arr[j]);
          j++;
        }
        
        while(j<n){
            hs.remove(arr[i]);
            if(hs.contains(arr[j])) return true;
            hs.add(arr[j]);
            i++;j++;
        }
        return false;

    }
}