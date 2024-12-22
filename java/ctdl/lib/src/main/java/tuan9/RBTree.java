package tuan9;

import bai1.LinkedQueue;

public class RBTree<Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int count;
        private boolean color;

        public Node(Key key, Value val, int count, boolean color) {
            this.key = key;
            this.val = val;
            this.count = count;
            this.color = color;
        }
    }

    private boolean isRed(Node x) {
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return root.count;
        }
    }

    private Node root;

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node root, Key key, Value val) {
        if(root == null) {
            return new Node(key, val, 1, RED);
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            root.left = put(root.left, key, val);
        } else if(cmp > 0) {
            root.right = put(root.right, key, val);
        } else {
            root.val = val;
        }
        if(isRed(root.right) && !isRed(root.left)) {
            root = rotateLeft(root);
        }
        if(isRed(root.left) && isRed(root.left.left)) {
            root = rotateRight(root);
        }
        if(isRed(root.left) && isRed(root.right)) {
            flipColors(root);
        }
        root.count = 1 + size(root.left) + size(root.right);
        return root;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.left.color = BLACK;
        h.right.color = BLACK;
        h.color = RED;
    }

    public Iterable<Key> keys() {
        LinkedQueue<Key> q = new LinkedQueue<>();
        inorder(root, q);
        return q;
    }

    private void inorder(Node x, LinkedQueue<Key> q) {
        if (x == null) {
            return;
        }
        inorder(x.left, q);
        q.enqueue(x.key);
        inorder(x.right, q);
    }

    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node root, Key key) {
        if (root == null) {
            return 0;
        }
        int cmp = key.compareTo(root.key);
        if (cmp < 0) {
            return rank(root.left, key);
        } else if (cmp > 0) {
            return 1 + size(root.left) + rank(root.right, key);
        } else {
            return size(root.left);
        }
    }

    public Value get(Key key) {
        if (root == null) {
            return null;
        }
        Node tmp = root;
        while (tmp != null) {
            int cmp = key.compareTo(tmp.key);
            if (cmp < 0) {
                tmp = tmp.left;
            } else if (cmp > 0) {
                tmp = tmp.right;
            } else {
                return tmp.val;
            }
        }
        return null;
    }

    public Value min() {
        return min(root).val;
    }

    private Node min(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root;
        }
        return min(root.left);
    }

    public Value max() {
        return max(root).val;
    }

    private Node max(Node root) {
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root;
        }
        return max(root.right);
    }

}
