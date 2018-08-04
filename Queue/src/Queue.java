public class Queue<Type> {
    private Node<Type> front;
    private Node<Type> rear;
    private int size = 0;

    private static class Node<Type> {
        Node<Type> next;
        Type data;

        public Node(Node<Type> next, Type data) {
            this.next = next;
            this.data = data;
        }
    }

    public void enqueue(Type data) {
        if (front == null || rear == null) {
            Node<Type> newnode = new Node<>(null, data);
            front = newnode;
            rear = newnode;
            size++;
        } else {
            Node<Type> newnode = new Node<>(null, data);
            rear.next = newnode;
            rear = newnode;
            size++;

        }
    }

    public void dequeue() {
        if (front == null || rear == null) {
            throw new NullPointerException("Queue is Empty");
        } else {
            front = front.next;
            size--;
        }
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public void iterate() {
        Node<Type> loop = front;
        while (loop != null) {
            System.out.print(loop.data + "->");
            loop = loop.next;
        }
    }

    public Type peek() {
        if (front == null || rear == null) {
            throw new NullPointerException("Queue is Empty");
        } else {
            return front.data;
        }
    }

}
