package DataStructures.LinkedList;

public class SingleLinkedList<T> {
    protected SLLNode<T> head, tail;
    public SingleLinkedList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void addToHead(T info){
        head = new SLLNode<T>(info, head);
        if(tail == null)
            tail = head;
    }
    public void add(T info){
        if(isEmpty()){
            head = tail = new SLLNode<T>(info);
        }
        else{
            tail.next = new SLLNode<T>(info);
            tail = tail.next;
        }
    }
    public void deleteFromHead(){
        if(isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        SLLNode<T> temp;
        for(temp = head ; temp.next != tail;temp = temp.next);
        tail = temp;
        tail.next = null;
        return;
    }

    @Override
    public String toString(){
        SLLNode<T> temp;
        String s ="";
        if(!isEmpty())
        for (temp = head ; temp!=null ; temp = temp.next){
            if(temp.next!=null)
                s += String.valueOf(temp.info)+", ";
            else
                s += String.valueOf(temp.info);
        }
        return "[ "+s+" ]";
    }
    public  void removeAllWithValue(T info){
        SLLNode<T> temp;
        if(!isEmpty()) {
            for (temp = head; temp.next != tail; temp = temp.next) {
                if (temp.next.info.equals(info)) {
                    SLLNode<T> clearTemp = temp.next;
                    temp.next = temp.next.next;
                    clearTemp.next = null;
                }
            }
        }
    }

}
