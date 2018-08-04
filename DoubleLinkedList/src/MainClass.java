public class MainClass {

    public static void main(String[] args) {


        DoubleLinkedList<String> linkedList=new DoubleLinkedList<>();
        linkedList.addToFirst("hello");
        linkedList.addToLast("Rishabh");
        System.out.println("Data at "+linkedList.dataAtPosition(3));

    }
}
