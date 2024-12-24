import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tuan7.MyMaxPQ;

import static org.junit.jupiter.api.Assertions.*;

class MyMaxPQTest {

    private MyMaxPQ<Integer> pq;

    @BeforeEach
    void setUp() {
        pq = new MyMaxPQ<>();
    }

    @Test
    void testInsertAndDelMax() {
        pq.insert(10);
        pq.insert(20);
        pq.insert(5);

        assertEquals(20, pq.delMax()); // 20 is the largest
        assertEquals(10, pq.delMax()); // Next largest is 10
        assertEquals(5, pq.delMax());  // Next largest is 5
    }

    @Test
    void testIsEmpty() {
        assertTrue(pq.isEmpty()); // Queue is empty at start

        pq.insert(1);
        assertFalse(pq.isEmpty()); // Queue is no longer empty

        pq.delMax();
        assertTrue(pq.isEmpty()); // Queue becomes empty after removal
    }

    @Test
    void testDelMaxOnEmptyQueue() {
        assertNull(pq.delMax()); // delMax should return null for empty queue
    }

    @Test
    void testResize() {
        // Insert enough elements to trigger a resize
        for (int i = 0; i < 100; i++) {
            pq.insert(i);
        }

        // Verify all elements are correctly prioritized
        for (int i = 99; i >= 0; i--) {
            assertEquals(i, pq.delMax());
        }

        assertTrue(pq.isEmpty());
    }

    @Test
    void testInsertWithDuplicates() {
        pq.insert(10);
        pq.insert(10);
        pq.insert(10);

        assertEquals(10, pq.delMax());
        assertEquals(10, pq.delMax());
        assertEquals(10, pq.delMax());

        assertTrue(pq.isEmpty());
    }

    @Test
    void testNegativeAndPositiveNumbers() {
        pq.insert(-10);
        pq.insert(0);
        pq.insert(10);

        assertEquals(10, pq.delMax()); // Largest is 10
        assertEquals(0, pq.delMax());  // Next is 0
        assertEquals(-10, pq.delMax()); // Smallest is -10
    }
}
