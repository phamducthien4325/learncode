import org.junit.jupiter.api.Test;

import bai1.LinkedStackOfStrings;

import static  org.junit.jupiter.api.Assertions.*;

class LinkedStackOfStringsTest {
   @Test
    void test1() {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
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
