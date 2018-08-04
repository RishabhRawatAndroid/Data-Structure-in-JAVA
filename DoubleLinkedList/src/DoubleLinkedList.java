public class DoubleLinkedList<Type extends Comparable> {

    private Node<Type> start = null;
    private Node<Type> end = null;
    private int size = 0;

    private static class Node<Type extends Comparable> {
        Type data;
        Node next;
        Node previous;

        public Node(Type data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    public void addToFirst(Type data) {
        if (start == null) {
            Node<Type> newnode = new Node<>(data, null, null);
            start = newnode;
            end = newnode;
            size++;
        } else {
            Node<Type> newnode = new Node<>(data, start, null);
            start.previous = newnode;
            start = newnode;
            size++;
        }
    }

    public void addToLast(Type data) {
        if (end == null) {
            Node<Type> newnode = new Node<>(data, null, null);
            start = newnode;
            end = newnode;
            size++;
        } else {
            Node<Type> newnode = new Node<>(data, null, end);
            end.next = newnode;
            end = newnode;
            size++;
        }
    }

    public void insetAtPosition(Type data, int position) {
        if (position > size || position < 0) {
            throw new NullPointerException("Position must be less than or equal to size of linked list or greater than 0");
        } else {
            if (position == 1)
                addToFirst(data);
            else if (position == size)
                addToLast(data);
            else {
                Node<Type> newnode = new Node<>(data, null, null);
                Node<Type> loop = start;
                for (int i = 1; i <= position - 1; i++) {
                    loop = loop.next;
                }
                Node<Type> temp = loop;
                newnode.setPrevious(temp);
                loop = loop.next;
                newnode.setNext(loop);
                temp.setNext(newnode);
                loop.setPrevious(newnode);
                ++size;
            }
        }
    }

    public void iterateListBackward() {
        Node<Type> loop = end;
        while (loop != null) {
            System.out.print(loop.data + "<=>");
            loop = loop.previous;
        }
        System.out.println();
    }

    public void iterateListForward() {
        Node<Type> loop = start;
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(loop.data + "<=>");
            loop = loop.next;
        }
    }

    public void deleteAtFirst() {
        if (start == null || end == null) {
            throw new IllegalStateException("Linked List is Empty");
        } else {
            start = start.next;
            size--;
        }
    }

    public void deleteAtLast() {
        if (start == null || end == null) {
            throw new IllegalStateException("Linked List is Empty");
        } else {
            end = end.previous;
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (position > size || position < 0) {
            throw new IllegalStateException("Position must be less than or equal to size of linked list or less than 0");
        } else {
            Node loop = start;
            for (int i = 0; i <= position - 1; i++) {
                loop = loop.next;
            }
            Node temp = loop;
            loop = loop.next.next;
            temp.setNext(loop);
            loop.setPrevious(temp);
            size--;
        }
    }

    public Type dataAtPosition(int position) {
        if (position > size || position < 0) {
            throw new NullPointerException("Position must be less than or equal to size of linked list or less than 0");
        } else {
            Node<Type> loop = start;
            for (int i = 1; i <= position - 1; i++) {
                loop = loop.next;
            }
            return loop.data;
        }
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public int getSize() {
        return size;
    }

}
