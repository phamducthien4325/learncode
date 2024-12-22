package tuan9;

import bai1.LinkedQueue;

public class MyBST<Key extends Comparable<Key>, Value> {
    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int count;

        public Node(Key key, Value val, int count) {
            this.key = key;
            this.val = val;
            this.count = count;
        }
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
        if(root == null) {
            return 0;
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            return rank(root.left, key);
        } else if(cmp > 0) {
            return 1 + size(root.left) + rank(root.right, key);
        } else {
            return size(root.left);
        }
    }

    public void put(Key key, Value val) {
        Node newNode = new Node(key, val, 1);
        root = put(root, newNode);
    }

    private Node put(Node root, Node newNode) {
        if (root == null) {
            newNode.count = 1;
            return newNode;
        }
        int cmp = newNode.key.compareTo(root.key);
        if (cmp < 0) {
            root.left = put(root.left, newNode);
        } else if (cmp > 0) {
            root.right = put(root.right, newNode);
        } else {
            root.val = newNode.val;
        }
        root.count = 1 + size(root.left) + size(root.right);
        return root;
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

    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node root, Key key) {
        if(root == null) {
            return null;
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            root.left = delete(root.left, key);
        } else if(cmp > 0) {
            root.right = delete(root.right, key);
        } else {
            if(root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            Node tmp = root;
            root = min(root.right);
            root.right = delMin(tmp.right);
            root.left = tmp.left; 
        }
        root.count = 1 + size(root.left) + size(root.right);
        return root;
    }

    public void delMin() {
        root = delMin(root);
    }

    private Node delMin(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        root.left = delMin(root.left);
        return root;
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
        if(root == null) {
            return null;
        }
        if(root.right == null) {
            return root;
        }
        return max(root.right);
    }

    public void delMax() {
        root = delMax(root);
    }

    private Node delMax(Node root) {
        if(root == null) {
            return null;
        }
        if(root.right == null) {
            return root.left;
        }
        root.right = delMax(root.right);
        return root;
    }
}
