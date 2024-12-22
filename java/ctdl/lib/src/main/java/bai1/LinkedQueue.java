package bai1;

import java.util.Iterator;

public class LinkedQueue<Item> implements Iterable<Item> {
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
        if (head == null) {
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

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item> () {
            private Node tmp = head;

            @Override
            public boolean hasNext() {
                return tmp != null;
            }

            @Override
            public Item next() {
                if(!hasNext()) {
                    return null;
                }
                Item item = tmp.item;
                tmp = tmp.next;
                return item;
            }
        };
    }
}
