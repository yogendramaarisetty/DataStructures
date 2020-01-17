package DataStructures.LinkedList;

public class DLLNode<T> {
    public T info;
    public DLLNode<T> prev;
    public DLLNode<T> next;
    DLLNode(){
        this.prev = null;
        this.next = null;
    }
    DLLNode(T info){
        this.info = info;
        this.prev = null;
        this.next = null;
    }
    DLLNode(DLLNode<T> prev,T info,DLLNode<T> next){
        this.prev = prev;
        this.next = next;
        this.info = info;
    }
    @Override
    public String toString(){
        return String.valueOf(this.info);
    }
}
