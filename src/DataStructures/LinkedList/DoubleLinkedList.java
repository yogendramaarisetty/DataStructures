package DataStructures.LinkedList;


public class DoubleLinkedList<T> {
    public DLLNode<T> head;
    public DLLNode<T> tail;
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public boolean is_empty(){
        return this.head == null && this.tail == null;
    }
    public void  addHeadNext(T info){
        if(head == null){
            head = new DLLNode<T>(info);
            tail = head;

        }
        else{
            if(head == tail){
                head.next = new DLLNode<T>(head,info,null);
                tail = head.next;
            }
            else{
                DLLNode<T> temp = head.next;
                head.next = new DLLNode<T>(head,info,head.next);
                temp.prev = head.next;
            }
        }
    }
    public void addHeadPrev(T info){
        if(head == null){
            head = new DLLNode<T>(info);
            tail = head;
        }
        else {
                head.prev = new DLLNode<T>(null, info,head);
                head = head.prev;
        }
    }

    public  void addTailNext(T info){
        if(tail == null){
            tail = new DLLNode<T>(info);
            head = tail;
        }
        else {
                tail.next = new DLLNode<T>(tail,info,null);
                tail = tail.next;
        }
    }
    public void addTailPrev(T info){
        if(tail == null){
            tail = new DLLNode<T>(info);
            head = tail;
        }
        else{
            if(head == tail){
                tail.prev = new DLLNode<T>(null,info,tail);
                head = tail.prev;
            }
            else {
                tail.prev.next = new DLLNode<>(tail.prev,info,tail);
                tail.prev = tail.prev.next;
            }
        }
    }
    @Override
    public String toString(){
        String s =  "[ ";

        for( DLLNode<T> temp = head;temp!=null;temp = temp.next){
            if(temp.next != null)
                s+= String.valueOf(temp.info)+", ";
            else
                s+= String.valueOf((temp.info));
        }
        return s+" ]";
    }

}
