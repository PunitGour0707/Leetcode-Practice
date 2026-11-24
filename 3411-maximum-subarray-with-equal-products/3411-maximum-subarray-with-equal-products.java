class Solution {
    public int maxLength(int[] arr) {
        int n=arr.length;
        int m=1;
        for(int i=0;i<n;i++){
            int p=arr[i];
            int g=arr[i];
            int l=arr[i];
            for(int j=i+1;j<n;j++){
               p*=arr[j];
               g=gcd(g,arr[j]);
               l=(l*arr[j])/gcd(l,arr[j]);
               if(p==l*g){
                m=Math.max(m,j-i+1);
               }
            }
        }
        return m;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}