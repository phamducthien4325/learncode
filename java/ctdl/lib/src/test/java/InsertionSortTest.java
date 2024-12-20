import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tuan5.InsertionSort;

public class InsertionSortTest {
    @Test
    void test1() {
        Integer[] a = new Integer[10];
        for (int i = 0; i < 10; ++i) {
            a[i] = 10 - i;
        }
        InsertionSort.sort(a);
        for (int i = 0; i < 10; ++i) {
            assertEquals(i + 1, a[i]);
        }
    }
}
