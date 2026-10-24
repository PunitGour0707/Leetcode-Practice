class Solution {
    public int countDaysTogether(String as, String ae, String bs, String be) {
        int a1=days(as);
        int a2=days(ae);
        int b1=days(bs);
        int b2=days(be);
        int start=Math.max(a1,b1);
        int end=Math.min(a2,b2);
        return end-start+1>0?end-start+1:0;
    }
    public int days(String s){
        int[] numdays={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] a=s.split("-");
        int month=Integer.parseInt(a[0]);
        int days=Integer.parseInt(a[1]);
        for(int i=0;i<month-1;i++){
            days+=numdays[i];
        }
        return days;
    }
}