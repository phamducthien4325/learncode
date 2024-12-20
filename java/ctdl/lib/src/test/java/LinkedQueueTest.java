import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bai1.LinkedQueue;

public class LinkedQueueTest{
    @Test
    void test1() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(1);
        queue.enqueue(1);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(4, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertEquals(1, queue.dequeue());
        assertEquals(1, queue.dequeue());
    }
}
