public class MainClass {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.enqueue(5,"hello");
        priorityQueue.enqueue(8,"Rishabh");
        priorityQueue.enqueue(1,"Rawat");
        priorityQueue.iterateList();
    }
}
