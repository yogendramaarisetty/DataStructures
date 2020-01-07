package Main;
import DataStructures.LinkedList.SingleLinkedList;

public class TestClass {
    public static void main(String args[]) {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        System.out.println(list);

        list.add(23);
        list.add(2);
        list.add(13);
        list.add(1);
        list.add(13);
        list.add(2);
        list.add(9);
        System.out.println(list);

        list.removeAllWithValue(13);
        System.out.println(list);

        list.delete();
        System.out.println(list);

        list.deleteFromHead();
        System.out.println(list);
    }
}
