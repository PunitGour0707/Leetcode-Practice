class Solution {
    public String processStr(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
           char c=s.charAt(i);
           if(Character.isLetter(c)){
            sb.append(c);
           }
           else if(c=='*'){
              if(sb.length()!=0){
                String s1=sb.substring(0,sb.length()-1);
                sb=new StringBuilder(s1);
              }
           }
           else if(c=='%'){
              sb.reverse();
           }
           else{
            sb.append(sb);
           }
        }
        return sb.toString();

    }
}