class Solution {
    public int sumCounts(List<Integer> li) {
        int n=li.size();
        int a=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<n;j++){
                hs.add(li.get(j));
                a+=hs.size()*hs.size();
            }
        }
        return a;
    }
}