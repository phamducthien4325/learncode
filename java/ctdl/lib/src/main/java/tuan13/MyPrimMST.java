package tuan13;

import bai1.LinkedQueue;
import tuan7.MyMinPQ;

public class MyPrimMST {
    private boolean[] marked;
    private LinkedQueue<MyEdge> mst;
    private MyMinPQ<MyEdge> pq;

    public MyPrimMST(MyEdgeWeightedGraph g, int s) {
        int v = g.V();
        marked = new boolean[v];
        mst = new LinkedQueue<>();
        pq = new MyMinPQ<>();
        visit(g, s);
        int cnt = 0;
        while(!pq.isEmpty() && cnt < v - 1) {
            MyEdge e = pq.delMin();
            int m = e.either();
            int n = e.other(m);
            if(marked[m] && marked[n]) {
                continue;
            }
            mst.enqueue(e);
            if(!marked[m]) {
                visit(g, n);
            }
            if(!marked[n]) {
                visit(g, m);
            }
        }
    }

    public void visit(MyEdgeWeightedGraph g, int s) {
        marked[s] = true;
        for(MyEdge e : g.adj(s)) {
            if(!marked[e.other(s)]) {
                pq.insert(e);
            }
        }
    }
}
