import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

import tuan6.MergeSort2;

public class MergeSortTest2 {
    @Test
    void test1() {
        int n = 10;
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; ++i) {
            a[i] = n - i - 1;
        }
        MergeSort2.sort(a, Comparator.naturalOrder()); 
        for(int i = 0; i < n; ++i) {
            assertEquals(i, a[i]);
        }
    }
}
