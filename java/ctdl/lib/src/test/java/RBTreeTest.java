import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tuan9.RBTree;

public class RBTreeTest {
    @Test
    void test1() {
        RBTree<Integer, String> bst = new RBTree<>();
        bst.put(1, "mot");
        bst.put(2, "hai");
        bst.put(5, "nam");
        bst.put(4, "bon");
        bst.put(3, "ba");
        assertEquals("hai", bst.get(2));
        assertEquals("mot", bst.get(1));
        assertEquals("nam", bst.max());
        assertEquals("mot", bst.min());
        int[] expectedKeys = {1, 2, 3, 4, 5 };
        int index = 0;
        for (int key : bst.keys()) {
            assertEquals(expectedKeys[index], key);
            index++;
        }

    }
}
