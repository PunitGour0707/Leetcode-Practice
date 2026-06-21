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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;tail=tail.next;
        }
        tail.next=head;
        k=k%len;
        int cnt=len-k;
        tail=tail.next;
        while(cnt>1){
            cnt--;
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        return head;
    }
}