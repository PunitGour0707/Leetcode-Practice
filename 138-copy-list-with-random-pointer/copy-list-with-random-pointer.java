/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node h=null;
        Node t=head;
        HashMap<Node,Node> mp=new HashMap<>();
        Node tail=null;
        while(t!=null){
            Node temp= new Node(t.val);
            mp.put(t,temp);
            if(h==null){
                h=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            t=t.next;
        }
        t=head;
        Node t2= h;
        while(t!=null){
          if(t.random==null){
            t2.random=null;
          }
          else{
            t2.random=mp.get(t.random);
          }
          t=t.next;
          t2=t2.next;
        }
        return h;

    }
}