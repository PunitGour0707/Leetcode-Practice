class Node {
    int key, val;
    Node next, prev;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
    public HashMap<Integer, Node> mp;
    Node head, tail;
    int c;

    void insert(Node cur) {
        Node front = head.next;
        cur.next = front;
        front.prev = cur;
        head.next = cur;
        cur.prev = head;
    }

    void delete(Node cur) {
        Node back = cur.prev;
        Node front = cur.next;
        front.prev = back;
        back.next = front;
    }

    public LRUCache(int capacity) {
        c = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        mp = new HashMap<>();
    }

    public int get(int key) {
        if (!mp.containsKey(key)) {
            return -1;
        }
        Node x = mp.get(key);
        delete(x);
        insert(x);
        return x.val;
    }

    public void put(int key, int value) {
        if (mp.containsKey(key)) {
            Node x = mp.get(key);
            x.val = value;
            delete(x);
            insert(x);
        }

        else {
            if (mp.size() == c) {
                Node x = tail.prev;
                delete(x);
                mp.remove(x.key);
            } 
            
                Node x = new Node(key, value);
                mp.put(key, x);
                insert(x);
            
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */