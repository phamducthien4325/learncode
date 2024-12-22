package tuan6;

import java.util.Comparator;

public class MergeSort2 {
    public static void sort(Object[] a, Comparator comp) {
        sort(comp, a, a.clone(), 0, a.length - 1);
    }

    public static void sort(Comparator comp, Object[] a, Object[] aux, int lo, int hi) {
        if (lo >= hi) {
            return ;
        }
        int mid = lo + (hi - lo) / 2;
        sort(comp, aux, a, lo, mid);
        sort(comp, aux, a, mid + 1, hi);
        merge(comp, a, aux, lo, mid, hi);
    }

    public static void merge(Comparator comp, Object[] a, Object[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; ++k) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(comp, aux[i] , aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    private static boolean less(Comparator comp, Object a, Object b) {
        return comp.compare(a, b) <= 0;
    }
} 

