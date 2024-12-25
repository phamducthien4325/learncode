package tuan13;

import bai1.LinkedQueue;
import tuan7.MyMinPQ;

public class MyKrusalMST {
    private LinkedQueue<MyEdge> mst = new LinkedQueue<>();

    public MyKrusalMST(MyEdgeWeightedGraph g) {
        MyMinPQ<MyEdge> q = new MyMinPQ<>();
        int v = g.V();
        for (int i = 0; i < v; ++i) {
            for(MyEdge x : g.adj(i)) {
                q.insert(x);
            }
        }
        MyUF uf = new MyUF(v);
        int cnt = 0;
        while(!q.isEmpty() && cnt < v - 1) {
            MyEdge e = q.delMin();
            int s = e.either();
            int w = e.other(s);
            if(!uf.connected(s, w)) {
                uf.union(s, w);
                mst.enqueue(e);
                ++cnt;
            }
        }
    }

    public Iterable<MyEdge> edges() {
        return mst;
    }
}
