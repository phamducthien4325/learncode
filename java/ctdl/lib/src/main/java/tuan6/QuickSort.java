package tuan6;

public class QuickSort{
    public static void sort(Comparable[] a) {
        MyRandom.suffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if(lo >= hi) {
            return;
        }
        int p = partition(a, lo, hi);
        sort(a, lo, p);
        sort(a, p + 1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while(true) {
            while(less(a[++i], a[lo])){
                if(i >= hi) {
                    break;
                }
            }
            while(less(a[lo], a[--j])) {
                if(j <= lo) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
