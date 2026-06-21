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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        if(head.next.next==null){
            head.next.next=head;
            head.next=null;
            head=temp;
            return head;
        }
        temp=head;
        ListNode prev=null;;
        ListNode front=temp.next;
        while(front!=null){
            temp.next=prev;
            prev=temp;
            temp=front;
            if(temp.next!=null ){front=front.next;
            }
            if(temp.next==null) front=null;
        }
        temp.next=prev;
        return temp;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode prev=null,l=head,r=head,front=head.next,newhead;
        while(left>1 || right>1){
            if(left>1){
                left--;
                prev=l;
                l=l.next;
            }
            if(right>1){
                right--;
                r=r.next;
                front=r.next;
            }
        }
        r.next=null;
        newhead=reverseList(l);
        if(l==head) head=newhead;
         if(prev!=null)prev.next=r;
        l.next=front;
        return head;

    }
}