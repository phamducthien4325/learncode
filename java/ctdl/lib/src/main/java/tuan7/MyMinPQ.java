package tuan7;

public class MyMinPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n;

    public MyMinPQ() {
        pq = (Key[]) new Comparable[2];
        n = 1;
    }

    public void insert(Key k) {
        if (n >= pq.length) {
            resize(n * 2);
        }
        pq[n++] = k;
        swim(n - 1);
    }

    private void resize(int capacity) {
        Key[] tmp = (Key[]) new Comparable[capacity];
        for (int i = 1; i < n; ++i) {
            tmp[i] = pq[i];
        }
        pq = tmp;
    }

    public Key delMin() {
        if (n == 1) {
            return null;
        }
        Key max = pq[1];
        exch(pq, 1, --n);
        sink(1);
        pq[n] = null;
        return max;
    }

    public boolean isEmpty() {
        return n == 1;
    }

    private void swim(int k) {
        while (k > 1 && less(pq[k / 2], pq[k])) {
            exch(pq, k, k / 2);
            swim(k / 2);
        }
    }

    private void sink(int k) {
        while (2 * k < n) {
            int j = 2 * k;
            if (j < n - 1 && less(pq[j], pq[j + 1])) {
                ++j;
            }
            if (less(pq[k], pq[j])) {
                exch(pq, k, j);
                k = j;
            } else {
                break;
            }
        }
    }

    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
