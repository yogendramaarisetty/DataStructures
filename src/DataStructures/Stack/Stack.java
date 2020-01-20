package DataStructures.Stack;
import DataStructures.LinkedList.DLLNode;
import DataStructures.LinkedList.DoubleLinkedList;

public class Stack<T> {
   private DoubleLinkedList<T> stk ;
    private DLLNode<T> top;
    public Stack(){
        stk = new DoubleLinkedList<T>();
        top = null;
    }
    public void push(T info){
        stk.addTailNext(info);
        top = stk.tail;
    }
    public void pop(){
        stk.deleteTail();
        top = stk.tail;
    }
    public boolean isEmpty(){
        return top == null ;
    }
    public  T head(){
        return top.info;
    }
    public int size(){
        int count = 0;
        for(DLLNode<T> temp = stk.head ; temp!=null;temp = temp.next){
            count++;
        }
        return count;
    }
}
