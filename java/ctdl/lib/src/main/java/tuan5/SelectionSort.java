package tuan5;

public class SelectionSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; ++i) {
            int min = i; 
            for (int j = i + 1; j < N; ++j) {
                if (less(a[j], a[i])) {
                    min = j;
                }
            }
            exch(a, i, min);
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
