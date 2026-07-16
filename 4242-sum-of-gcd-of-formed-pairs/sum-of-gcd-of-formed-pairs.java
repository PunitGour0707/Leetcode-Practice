class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] arr) {
        int n=arr.length;
        int[] pgcd=new int[n];
        int maxi=arr[0];
        // for(int i=0;i<n;i++){
        //     maxi=Math.max(arr[i], maxi);
        // }
        for(int i=0;i<n;i++){
            maxi=Math.max(arr[i],maxi);
            pgcd[i]=gcd(arr[i],maxi);
        }
        Arrays.sort(pgcd);
        int i=0,j=n-1;
        long an=0;
        while(i<j){
            an+=gcd(pgcd[i],pgcd[j]);
            i++;
            j--;
        }
        return an;
    }
}