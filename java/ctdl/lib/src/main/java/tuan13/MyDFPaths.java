package tuan13;

import java.util.Stack;

public class MyDFPaths extends MyPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public MyDFPaths(MyGraph g, int s) {
        this.s = s;
        int v = g.V();
        marked = new boolean[v];
        edgeTo = new int[v];
        dfs(g, s);
    }

    private void dfs(MyGraph g, int v) {
        marked[v] = true;
        for(int x : g.adj(v)) {
            if(!marked[x]) {
                dfs(g, x);
                edgeTo[x] = v;
            }
        }
    }

    @Override
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    @Override
    public Iterable<Integer> pathTo(int v) {
        if(!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        while(v != s) {
            stack.push(edgeTo[v]);
            v = edgeTo[v];
        }
        return stack;
    }
}
