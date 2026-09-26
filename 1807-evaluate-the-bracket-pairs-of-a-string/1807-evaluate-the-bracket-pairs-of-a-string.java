class Solution {
    public String evaluate(String s, List<List<String>> li) {
        int n=s.length();
        int m=li.size();
        StringBuilder sb=new StringBuilder("");
        HashMap<String,String> mp=new HashMap<>();
        for(int i=0;i<m;i++){
            mp.put(li.get(i).get(0),li.get(i).get(1));
        }
        int i=0;
        while(i<n){
            if(s.charAt(i)=='('){
                i++;
                StringBuilder temp=new StringBuilder("");
                while(i<n && s.charAt(i)!=')'){
                    temp.append(s.charAt(i));
                    i++;
                }
                
                String s1=temp.toString();
                if(mp.containsKey(s1)){
                    sb.append(mp.get(s1));
                }
                else{
                    sb.append('?');
                }
            }
            else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}