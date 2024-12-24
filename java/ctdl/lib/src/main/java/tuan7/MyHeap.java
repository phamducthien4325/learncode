package tuan7;

public class MyHeap {
    public static void sort(Comparable[] a) {
        int n = a.length;
        MyMaxPQ pq = new MyMaxPQ();
        for(int i = 0; i < n; ++i) {
            pq.insert(a[i]);
        }
        for(int i = n - 1; i >= 0; --i) {
            a[i] = pq.delMax();
        }
    }
}
