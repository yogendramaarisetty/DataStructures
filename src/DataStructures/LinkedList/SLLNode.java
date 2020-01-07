package DataStructures.LinkedList;

public class SLLNode<T> {
    public T info;
    public SLLNode<T> next;

    public SLLNode(){
        next = null;
    }
    public SLLNode(T info){
        this.info = info;
        next = null;
    }
    public SLLNode(T info,SLLNode<T> next){
        this.info = info;
        this.next = next;
    }
}
