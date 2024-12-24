import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import tuan7.MyHeap;

public class MyHeapTest {

    @Test
    void testEmptyArray() {
        Comparable[] array = {};
        MyHeap.sort(array);
        assertArrayEquals(new Comparable[]{}, array, "Sorting an empty array should result in an empty array");
    }

    @Test
    void testSingleElementArray() {
        Comparable[] array = {1};
        MyHeap.sort(array);
        assertArrayEquals(new Comparable[]{1}, array, "Sorting a single-element array should return the same array");
    }

    @Test
    void testIntegerArray() {
        Comparable[] array = {5, 2, 9, 1, 5, 6};
        Comparable[] expected = {1, 2, 5, 5, 6, 9}; // Thứ tự tăng dần
        MyHeap.sort(array);
        assertArrayEquals(expected, array, "Integer array should be sorted in ascending order");
    }

    @Test
    void testStringArray() {
        Comparable[] array = {"banana", "apple", "date", "cherry"};
        Comparable[] expected = {"apple", "banana", "cherry", "date"}; // Thứ tự tăng dần
        MyHeap.sort(array);
        assertArrayEquals(expected, array, "String array should be sorted in ascending order");
    }

    @Test
    void testArrayWithDuplicates() {
        Comparable[] array = {3, 1, 3, 2, 1};
        Comparable[] expected = {1, 1, 2, 3, 3}; // Thứ tự tăng dần
        MyHeap.sort(array);
        assertArrayEquals(expected, array, "Array with duplicates should be sorted in ascending order");
    }
}
