package tuan3.hackerank;
import bai1.ResizingArrayStackOfStrings ;

public class BalanceBrackets {
    public static String isBalance(String s) {
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
        for (int i = 0; i < s.length(); ++i) {
            String c = s.substring(i, i + 1);
            if (c == "(" || c == "[" || c == "{") {
                stack.push(c);
            } else {
                String o = stack.pop();
                if (o == "(") {
                    o = ")";
                } else if (o == "[") {
                    o = "]";
                } else {
                    o = "}";
                }
                if (o != c) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
