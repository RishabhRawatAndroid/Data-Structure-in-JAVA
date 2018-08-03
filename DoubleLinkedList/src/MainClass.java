public class MainClass {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList=new DoubleLinkedList<>();
        doubleLinkedList.addToFirst(10);
        doubleLinkedList.addToFirst(9);
        doubleLinkedList.addToFirst(8);
        doubleLinkedList.addToFirst(7);
        doubleLinkedList.addToFirst(6);
        doubleLinkedList.addToFirst(5);
        doubleLinkedList.addToFirst(4);
        doubleLinkedList.addToLast(99);
        doubleLinkedList.addToLast(98);
        doubleLinkedList.addToLast(97);
        doubleLinkedList.insetAtPosition(555,7);
        doubleLinkedList.iterateListForward();
        System.out.println();
        doubleLinkedList.deleteAtPosition(5);
        doubleLinkedList.iterateListForward();

    }
}
