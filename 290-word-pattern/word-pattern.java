class Solution {
    public boolean wordPattern(String pat, String s) {
        HashMap<Character,String> mp=new HashMap<>();
        HashMap<String,Character> mp2=new HashMap<>();
        int m=pat.length();
        int n=s.length();
        int j=0;
        for(int i=0;i<m;i++){
            String cur="";  
            while (j<n && s.charAt(j)!=' ' ){
                cur+=s.charAt(j);j++;
            }
            j++;
            if(mp.isEmpty()){
                mp.put(pat.charAt(i),cur);
                mp2.put(cur,pat.charAt(i));

            }
            else{

                if(mp.containsKey(pat.charAt(i)) || mp2.containsKey(cur) ){
                    if(!cur.equals(mp.get(pat.charAt(i))) || pat.charAt(i)!= mp2.get(cur) ) return false;
                }
                else{
                    mp.put(pat.charAt(i),cur);               
                    mp2.put(cur,pat.charAt(i));               
                }
            }

        }
        if(j!=n+1) return false;
        return true;
    }
}