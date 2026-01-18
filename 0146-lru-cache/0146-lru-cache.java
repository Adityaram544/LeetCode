class Node{
    int key,val;
    Node next,prev;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class LRUCache {
    Map<Integer,Node> map=new HashMap<>();
    private Node head=new Node(-1,-1);
    private Node tail=new Node(-1,-1);
    private int cap;
    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node x=map.get(key);
            deleteNode(x);
            insertAfterHead(x);
            return x.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node x=map.get(key);
            x.val=value;
            deleteNode(x);
            insertAfterHead(x);
            return;
        }
        if(map.size()==cap){
            Node x=tail.prev;
            map.remove(x.key);
            deleteNode(x);
        }
        insertAfterHead(new Node(key,value));
        map.put(key,head.next);
    }

    private void deleteNode(Node delNode){
        Node delprev=delNode.prev;
        Node delnext=delNode.next;

        delprev.next=delnext;
        delnext.prev=delprev;
    }
    
    private void insertAfterHead(Node newNode){
        Node nextNode=head.next;
        newNode.next=nextNode;
        newNode.prev=head;

        head.next=newNode;
        nextNode.prev=newNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */