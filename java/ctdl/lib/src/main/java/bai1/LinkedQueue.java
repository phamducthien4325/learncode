package bai1;

public class LinkedQueue<Item> {
    class Node {
        Item item;
        Node next;

        Node(Item item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(Item item) {
        Node newNode = new Node(item);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Item dequeue() {
        if(head == null) {
            return null;
        } else {
            Item res = head.item;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return res;
        }
    }

    public Item peek() {
        return head.item;
    }
}
