package tuan5;

public class InsertionSort {
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; ++i){
            if (less(a[i + 1], a[i])) {
                int j = i;
                while(j >= 0 && less(a[j + 1], a[j])) {
                    exch(a, j, j + 1);
                    --j;
                }
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        if (a.compareTo(b) < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
