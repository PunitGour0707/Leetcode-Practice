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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        if (head.next.next == null) {
            ListNode temp = head.next;
            head.next.next = head;
            head.next = null;
            return temp;
        }
        ListNode newhead = head.next;
        ListNode prev = head;
        ListNode temp = head.next;
        ListNode front = temp.next;
        while (front != null && front.next != null) {
            temp.next = prev;
            prev.next = front.next;
            if (front != null && front.next != null) {
                temp = front.next;
                prev = front;
                front = temp.next;
            }
        }
        temp.next = prev;
        prev.next = front;

        return newhead;
    }
}