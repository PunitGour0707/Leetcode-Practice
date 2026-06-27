class Solution {
    public int singleNumber(int[] arr) {
     
        int ans=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int n:arr){
                if(((n>>i)&1)==1)c++;
            }
            if(c%3!=0)ans=ans|(1<<i);
        }
        return ans;
        
    }
}