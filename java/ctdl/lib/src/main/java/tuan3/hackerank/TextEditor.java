package tuan3.hackerank;

import java.util.Scanner;
import java.util.Stack;

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String s = "";
        Stack<String> stack = new Stack<>();
        for (int p = 0; p < q; ++p) {
            int t = sc.nextInt();
            if(t == 1) {
                String tmp = sc.next();
                stack.push(s);
                s = s + tmp;
            } else if (t == 2) {
                int k = sc.nextInt();
                stack.push(s);
                s = s.substring(0, s.length() - k);
            } else if (t == 3) {
                int k = sc.nextInt();
                System.out.println(s.charAt(k - 1));
            } else {
                s = stack.pop();
            }
        }
        sc.close();
    }
}
