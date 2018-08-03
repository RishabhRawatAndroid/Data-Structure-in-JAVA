import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) throws IllegalAccessException {
        SingleLinkedList<Integer> singleLinkedList=new SingleLinkedList<>();
        singleLinkedList.addtoLast(100);
        singleLinkedList.addtoLast(101);
        singleLinkedList.addtoLast(102);
        singleLinkedList.addtoFirstArrayParms(1,2,3,4,5,6,7,8,9,10);
        singleLinkedList.iterateLinkedList();
        singleLinkedList.reverseList();
        singleLinkedList.iterateLinkedList();

    }
}


