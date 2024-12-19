package bai1;

public class ResizingArrayStackOfStrings {
    private String[] s;
    private int N;

    public ResizingArrayStackOfStrings() {
        s = new String[1];
    }

    public void push(String item) {
        if (N == s.length) {
            resize(s.length * 2);
        }
        s[N++] = item;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; ++i) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public String pop() {
        if (N == s.length / 4) {
            resize(s.length / 2); 
        }
        String res = s[--N];
        s[N] = null;
        return res;
    }

    public boolean isEmpty() {
        return N == 0;
    }
}
