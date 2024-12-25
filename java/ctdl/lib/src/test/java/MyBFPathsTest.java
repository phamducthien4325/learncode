import static org.junit.jupiter.api.Assertions.*;
import tuan13.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class MyBFPathsTest {

    @Test
    void testBfsPaths() {
        MyGraph g = new MyGraph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        // Khởi tạo BFS từ đỉnh 0
        MyBFPaths paths = new MyBFPaths(g, 0);

        // Kiểm tra đường đi từ 0 đến các đỉnh
        assertTrue(paths.hasPathTo(5));

        // Kiểm tra khoảng cách từ 0 đến 5
        assertEquals(4, paths.distTo(5)); // 0 -> 1 -> 3 -> 4 -> 5

    }

    @Test
    void testNoPath() {
        MyGraph g = new MyGraph(4);
        g.addEdge(0, 1);
        g.addEdge(2, 3);

        MyBFPaths paths = new MyBFPaths(g, 0);

        // Kiểm tra không có đường đi từ 0 đến 3
        assertFalse(paths.hasPathTo(3));
        assertNull(paths.pathTo(3));
    }

    // Phương thức phụ để chuyển Iterable thành mảng (không dùng Stream API)
    private Integer[] pathToArray(Iterable<Integer> path) {
        if (path == null) return null;

        // Chuyển Iterable thành List trước
        List<Integer> list = new ArrayList<>();
        for (Integer node : path) {
            list.add(node);
        }

        // Chuyển List thành mảng
        return list.toArray(new Integer[0]);
    }
}
