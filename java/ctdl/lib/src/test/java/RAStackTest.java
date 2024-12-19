import org.junit.jupiter.api.Test;
import bai1.ResizingArrayStackOfStrings;

import static  org.junit.jupiter.api.Assertions.*;

class RAStackTest{
   @Test
    void test1() {
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
        stack.push("to");
        stack.push("be");
        stack.push("or");
        stack.push("not");
        stack.push("to");
        assertEquals("to", stack.pop());
        stack.push("be");
        assertEquals("be", stack.pop());
        assertEquals("not", stack.pop());
        stack.push("that");
        assertEquals("that", stack.pop());
        assertEquals("or", stack.pop());
        assertEquals("be", stack.pop());
        stack.push("is");
    }
}
