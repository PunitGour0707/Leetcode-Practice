class Solution {
    public String convert(String s, int n) {
        int l=s.length();
        if(n==1||n>s.length())return s;
        StringBuilder[] arr=new StringBuilder[n];
        for(int i=0;i<n;i++){
            arr[i]=new StringBuilder("");
        }
        int cur=0;
        boolean godown=true;
        for(int i=0;i<l;i++){
             if(cur==0)godown=true;
             else if(cur==n-1)godown=false;
             arr[cur].append(s.charAt(i));
             if(godown)cur++;
             else cur--;
        }
         StringBuilder sb=new StringBuilder("");
         for(StringBuilder st:arr){
            sb.append(st);
         }
         return sb.toString();


         
    }
}