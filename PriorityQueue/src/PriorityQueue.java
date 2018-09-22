public class PriorityQueue<Type> {
    private Node<Type> start;
    private Node<Type> end;
    private int size = 0;

    private static class Node<Type> {
        int priority;
        Node<Type> next;
        Type data;

        public Node(int priority, Node<Type> next, Type data) {
            this.priority = priority;
            this.next = next;
            this.data = data;
        }

        public void setNext(Node<Type> next) {
            this.next = next;
        }
    }

    private int getPositionBasedOnPriority(int priority) {
        Node<Type> loop = start;
        int pos = 0;
        while (loop != null) {
            if (priority >= loop.priority) {
                pos++;
                break;
            }
            pos++;
            loop = loop.next;
        }
        return pos;
    }

    private void insertAtFirst(int priority, Type data) {

        Node<Type> newnode = new Node<>(priority, start, data);
        start = newnode;
        size++;
    }

    private void inserAtLast(int priority, Type data) {

        Node<Type> newnode = new Node<>(priority, null, data);
        end.next = newnode;
        end = newnode;
        size++;
    }

    private void insertAtPosition(int priority, Type data, int position) {

        Node<Type> loop = start;
        for (int i = 1; i <= position - 1; i++) {
            loop = loop.next;
        }
        Node<Type> temp = loop;
        Node<Type> newnode = new Node<>(priority, null, data);
        temp.next = newnode;
        loop = loop.next;
        newnode.next = loop;
        size++;
    }

    public void enqueue(int priority, Type data) {
        if (start == null || end == null) {
            Node<Type> newnode = new Node<>(priority, null, data);
            start = newnode;
            end = newnode;
            size++;
        } else {
            int position = getPositionBasedOnPriority(priority);
            if (position > size)
                inserAtLast(priority, data);
            else if (position == 1)
                insertAtFirst(priority, data);
            else
                insertAtPosition(priority, data, position);
        }
    }

    public void iterateList() {
        if (start == null || end == null)
            throw new NullPointerException("Priority Queue is Empty");
        else {
            Node<Type> loop = start;
            while (loop != null) {
                System.out.print("(P- " + loop.priority + " ) (D- " + loop.data + ")-->");
                loop = loop.next;
            }
        }
    }
}
