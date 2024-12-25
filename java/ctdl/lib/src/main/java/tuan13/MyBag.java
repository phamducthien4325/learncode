package tuan13;

import java.util.Iterator;

public class MyBag<Item> implements Iterable<Item> {
    private Node head;

    class Node {
        private Item item;
        private Node next;

        Node(Item item) {
            this.item = item;
        }
    }

    public MyBag() {
        head = null;
    }

    public void add(Item item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node tmp = head;

            @Override
            public boolean hasNext() {
                return tmp != null;
            }

            @Override
            public Item next() {
                if (!hasNext()) {
                    return null;
                }
                Item res = tmp.item;
                tmp = tmp.next;
                return res;
            }
        };
    }
}
