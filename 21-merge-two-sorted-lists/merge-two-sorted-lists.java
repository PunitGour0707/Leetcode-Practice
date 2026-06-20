/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode d=new ListNode(-1);
        ListNode temp=d;
        ListNode t1=h1;
        ListNode t2=h2;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1==null) temp.next=t2;
        else temp.next=t1;
        return d.next;
    }
}