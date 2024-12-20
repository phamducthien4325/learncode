import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tuan5.SelectionSort;

public class SelectionSortTest {
    @Test
    void test1() {
        Integer[] a = new Integer[10];
        for (int i = 0; i < 10; ++i) {
            a[i] = 10 - i;
        }
        SelectionSort.sort(a);
        for (int i = 0; i < 10; ++i) {
            assertEquals(i + 1, a[i]);
        }
    }
}
