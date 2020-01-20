package Main;
import DataStructures.LinkedList.SingleLinkedList;
import  DataStructures.LinkedList.DoubleLinkedList;
import DataStructures.Stack.Stack;

import javax.sound.midi.Soundbank;

public class TestClass {
    public static void main(String args[]) {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
       dll.addTailNext(11);
        dll.addTailNext(12);
        dll.addTailNext(13);
        dll.addTailNext(14);

        dll.addHeadNext(10);// initially 10 is added[10]

        dll.addHeadNext(20);// 20 is added next to 10 [10,20]

        dll.addHeadNext(30);// 30 is added next to 10 [10,30,20]

        dll.addHeadNext(40);// 40 is added next to 10 [10,40,30,20]

        dll.addHeadPrev(50);// 50 is added prev to 10 [50,10,40,30,20]

        dll.addTailNext(60);// 60 is added next to 20 [50,10,40,30,20,60]

        dll.addTailPrev(70);// 70 is added prev to 60 [50,10.40,30,20,70,60]


        System.out.println(dll.head+" "+dll.head.next+" "+dll.head.next.next+" "+dll.head.next.next.next);
        System.out.println(dll.tail+" "+dll.tail.prev+" "+dll.tail.prev.prev+" "+dll.tail.prev.prev.prev);
        System.out.println(dll);
        dll.deleteTail();
        System.out.println(dll);
        dll.deleteTail();
        System.out.println(dll);
        Stack<Integer> i = new Stack<Integer>();
        i.pop();
        System.out.println(i.isEmpty());
        i.push(20);
        i.push(30);
        i.push(40);
        System.out.println(i.head());
        System.out.println(i.size());
        i.pop();
        System.out.println(i.head());
        System.out.println(i.size());
        i.pop();
        System.out.println(i.head());
        System.out.println(i.size());
        i.pop();
        i.pop();


    }
}
