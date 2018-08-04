public class Stack<Type> {
    private Node<Type> start;
    private int size;

    private static class Node<Type> {
        Node<Type> next;
        Type data;

        public Node(Node<Type> next, Type data) {
            this.next = next;
            this.data = data;
        }
    }

    public void push(Type data) {
        if (start == null) {
            Node<Type> newnode = new Node<>(null, data);
            start = newnode;
            size++;
        } else {
            Node<Type> newnode = new Node<>(start, data);
            start = newnode;
            size++;
        }
    }

    public void pop() {
        if (start == null) {
            throw new NullPointerException("Stack is Empty");
        } else {
            start = start.next;
            size--;
        }
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public Type peek() {
        if (start == null) {
            throw new NullPointerException("Stack is Empty");
        } else {
           return start.data;
        }
    }

    public void iterate()
    {
        Node<Type> temp=start;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
