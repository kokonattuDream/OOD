public class DataType<T> {
    private class Node<T>{
        T content;
        Node next;
        Node prev;
        public Node(T item){
            this.content = item;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private Node curr;
    private int size;
    public DataType(){
        head = new Node(null);
        tail = new Node(null);
        curr = head;
        size = 0;
    }
    /**
     * h -> a -> t
     * h -> a -> b -> t
     */
    public void add(T item){
        Node newNode = new Node(item);
        curr.next = newNode;
        newNode.prev = curr;

        tail.prev = newNode;
        newNode.next = tail;

        curr = newNode;
        size++;
    }
    /**
     * h -> a -> t
     * h -> a -> b -> t
     */
    public T removeOldest(){
        if(this.size == 0){
            return null;
        }
        Node removed = head.next;
        if(size == 1){
            head.next = null;
            tail.prev = null;
        } else {
            head.next = removed.next;
            removed.next.prev = head;
        }
        this.size--;
        return removed.content;
    }
    /**
     * h -> a -> t
     * h -> a -> b -> t
     */
    public void removeNewest(){
        if(this.size == 0){
            return;
        }
        Node removed = tail.prev;
        if(this.size == 1){
            tail.prev = null;
            head.next = null;
        } else {
            tail.prev = removed.prev;
            removed.prev.next = tail;
        }
    }
}
