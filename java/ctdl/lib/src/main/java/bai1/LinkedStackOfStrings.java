package bai1;

public class LinkedStackOfStrings {
    private class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item; 
        }
    }

    Node first = null;

    public void push(String item) {
        Node newNode = new Node(item);
        newNode.next = first;
        first = newNode;
    }
    
    public String pop() {
       if (first == null) {
            return null;
        }
        String res = first.item;
        first = first.next;
        return res;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
