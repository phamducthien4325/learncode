import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tuan6.MergeSort;

public class MergeSortTest {
    @Test
    void test1() {
        int n = 10;
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; ++i) {
            a[i] = n - i - 1;
        }
        MergeSort.sort(a); 
        for(int i = 0; i < n; ++i) {
            assertEquals(i, a[i]);
        }
    }
}
