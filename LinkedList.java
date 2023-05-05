
public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list.get(1)); // Output: 3
    }
}


//This program defines a `LinkedList` class that has methods for adding and removing elements, getting the size of the list, and getting an element at a specific index. The `Node` class is a private inner class that represents a node in the linked list. The `main` method demonstrates how to use the `LinkedList` class by adding three elements, removing one, and getting an element at index 1.


