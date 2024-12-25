package tuan13;

import java.util.NoSuchElementException;

public class MyIndexMinPQ<Key extends Comparable<Key>> {
    private int maxN;        // Maximum number of elements on PQ
    private int n;           // Number of elements on PQ
    private int[] pq;        // Binary heap using 1-based indexing
    private int[] qp;        // Inverse of pq - qp[pq[i]] = pq[qp[i]] = i
    private Key[] keys;      // Keys associated with indices

    // Create an indexed priority queue with indices 0 to maxN-1
    public MyIndexMinPQ(int maxN) {
        if (maxN < 0) throw new IllegalArgumentException();
        this.maxN = maxN;
        n = 0;
        keys = (Key[]) new Comparable[maxN + 1];  // Make this of size maxN + 1
        pq = new int[maxN + 1];
        qp = new int[maxN + 1];                  // Make this of size maxN + 1
        for (int i = 0; i <= maxN; i++) qp[i] = -1;
    }

    // Is the priority queue empty?
    public boolean isEmpty() {
        return n == 0;
    }

    // Is i an index on the priority queue?
    public boolean contains(int i) {
        validateIndex(i);
        return qp[i] != -1;
    }

    // Number of keys in the priority queue
    public int size() {
        return n;
    }

    // Associate key with index i
    public void insert(int i, Key key) {
        validateIndex(i);
        if (contains(i)) throw new IllegalArgumentException("Index is already in the priority queue");
        n++;
        qp[i] = n;
        pq[n] = i;
        keys[i] = key;
        swim(n);
    }

    // Decrease the key associated with index i to the specified value
    public void decreaseKey(int i, Key key) {
        validateIndex(i);
        if (!contains(i)) throw new NoSuchElementException("Index is not in the priority queue");
        if (keys[i].compareTo(key) <= 0)
            throw new IllegalArgumentException("Calling decreaseKey() with a key greater than the current key");
        keys[i] = key;
        swim(qp[i]);
    }

    // Remove a minimal key and return its associated index
    public int delMin() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        int min = pq[1];
        exch(1, n--);
        sink(1);
        assert min == pq[n + 1];
        qp[min] = -1;         // Delete
        keys[min] = null;     // To help with garbage collection
        pq[n + 1] = -1;       // Not needed
        return min;
    }

    // Helper functions
    private boolean greater(int i, int j) {
        return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
    }

    private void exch(int i, int j) {
        int swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    // Swim up to maintain heap invariant
    private void swim(int k) {
        while (k > 1 && greater(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    // Sink down to maintain heap invariant
    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && greater(j, j + 1)) j++;
            if (!greater(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    // Validate index
    private void validateIndex(int i) {
        if (i < 0 || i >= maxN)
            throw new IllegalArgumentException("Index is out of bounds");
    }
}
