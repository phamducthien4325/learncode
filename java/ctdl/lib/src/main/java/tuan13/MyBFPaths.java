package tuan13;

import java.util.Stack;

import bai1.LinkedQueue;

public class MyBFPaths extends MyPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;
    private int[] distTo;

    public MyBFPaths(MyGraph g, int s) {
        this.s = s;
        int v = g.V();
        marked = new boolean[v];
        edgeTo = new int[v];
        distTo = new int[v];
        bfs(g, s);
    }

    private void bfs(MyGraph g, int v) {
        marked[v] = true;
        LinkedQueue<Integer> q = new LinkedQueue<>();
        q.enqueue(v);
        distTo[v] = 0;
        while(!q.isEmpty()) {
            v = q.dequeue();
            for(int x : g.adj(v)) {
                if(!marked[x]) {
                    q.enqueue(x);
                    marked[x] = true;
                    edgeTo[x] = v;
                    distTo[x] = 1 + distTo[v];
                }
            }
        }
    }

    public int distTo(int v) {
        return distTo[v];
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
