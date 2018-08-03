
public class SingleLinkedList<Type extends Comparable> {
    private Node<Type> start;
    private Node<Type> end;
    private int size = 0;

    private static class Node<Type extends Comparable> {
        Node next;
        Type data;

        public Node(Node next, Type data) {
            this.next = next;
            this.data = data;
        }

    }

    public void addtoFirst(Type data) {
        if (start == null) {
            Node<Type> newnode = new Node<>(null, data);
            start = newnode;
            end = newnode;
            size++;
        } else {
            Node<Type> newnode = new Node<>(start, data);
            start = newnode;
            size++;
        }
    }

    public void addtoLast(Type data) {
        if (end == null) {
            Node<Type> newnode = new Node<>(null, data);
            start = newnode;
            end = newnode;
            size++;
        } else {
            Node<Type> newnode = new Node<>(end, data);
            end.next = newnode;
            end = newnode;
            size++;
        }
    }

    public void addtoPosition(int position, Type data) throws IllegalAccessException {
        if (size < position) {
            throw new IllegalAccessException("Position is greater then the size of LinkedList");
        } else {
            Node temp = start;
            for (int i = 1; i <= position - 1; i++) {
                temp = temp.next;
            }
            Node temp1 = temp;
            temp1 = temp1.next;
            Node<Type> newnode = new Node<>(temp1, data);
            temp.next = newnode;
            size++;
        }
    }

    public void iterateLinkedList() {
        Node<Type> iteratenode = start;
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(iteratenode.data + "->");
            iteratenode = iteratenode.next;
        }
        System.out.println();
    }

    public void deleteAtFirst() {
        if (start == null && end == null) {
            throw new IllegalCallerException("Your linked list is Empty");
        } else {
            start = start.next;
            size--;
        }
    }

    public void deleteAtLast() {
        if (start == null && end == null) {
            throw new IllegalCallerException("Your linked list is Empty");
        } else {
            Node<Type> newnode = start;
            for (int i = 0; i <= size - 1; i++) {
                newnode = newnode.next;
            }
            end = newnode;
            size--;
        }
    }

    public void deleteAtPosition(int position) throws IllegalAccessException {
        if (position > size && position < 0) {
            throw new IllegalAccessException("Your linked list is Empty");
        } else {
            Node newnode = start;
            for (int i = 2; i <= position - 1; i++) {
                newnode = newnode.next;
            }
            Node temp = newnode;
            newnode = newnode.next.next;
            temp.next = newnode;
            size--;
        }
    }

    public boolean isEmpty() {
        if (size != 0)
            return false;
        else
            return true;
    }


    public void addtoFirstArrayParms(Type... array) {
        for (int i = 0; i <= array.length - 1; i++) {
            addtoFirst(array[i]);
        }
    }

    public void addtoFirstArray(Type... array) {
        for (int i = 0; i <= array.length - 1; i++) {
            addtoFirst(array[i]);
        }
    }


    public void addtoLastArrayParms(Type... array) {
        for (int i = 0; i <= array.length - 1; i++) {
            addtoLast(array[i]);
        }
    }

    public void addtoLastArray(Type[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            addtoLast(array[i]);
        }
    }

    public boolean findData(Type data) {
        Node temp = start;
        for (int i = 0; i <= size - 1; i++) {
            if (temp.data == data)
                return true;
        }
        return false;
    }

    public void reverseList() {
        Node<Type> temp = start;
        for (int i = 1; i <= size / 2; i++) {
            Node<Type> loop = temp;
            for (int j = i; j <= size - i; j++) {
                loop = loop.next;
            }
            Type data = loop.data;
            loop.data = temp.data;
            temp.data = data;
            temp = temp.next;
        }
    }


}
