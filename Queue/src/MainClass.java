public class MainClass {
    public static void main(String[] args) {
        Queue<Integer> integerQueue=new Queue<>();
        integerQueue.enqueue(5);
        integerQueue.enqueue(10);
        integerQueue.enqueue(15);
        integerQueue.iterate();
        integerQueue.dequeue();
        System.out.println();
        integerQueue.iterate();
    }
}
