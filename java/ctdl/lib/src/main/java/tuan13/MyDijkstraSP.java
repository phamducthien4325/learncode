package tuan13;

import java.util.Stack;

public class MyDijkstraSP {
    private double[] distTo;
    private MyDiedge[] edgeTo;
    private MyIndexMinPQ<Double> pq;

    public MyDijkstraSP(MyEdgeWeightedDigraph g, int s) {
        int v = g.V();
        distTo = new double[v];
        edgeTo = new MyDiedge[v];
        pq = new MyIndexMinPQ<>(v);
        for (int i = 0; i < v; ++i) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }

        pq.insert(s, 0.0);
        while(!pq.isEmpty()) {
            int x = pq.delMin();
            for(MyDiedge w : g.adj(x)) {
                relax(w);
            }
        }
    }

    public double distTo(int v) {
        return distTo[v];
    }

    public Iterable<MyDiedge> pathTo(int v) {
        Stack<MyDiedge> stack = new Stack<>();
        while(edgeTo[v] != null) {
            stack.push(edgeTo[v]);
            v = edgeTo[v].from();
        }
        return stack;
    }

    private void relax(MyDiedge e) {
        int v = e.from();
        int w = e.to();
        if(distTo[w] > distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
            if(pq.contains(w)) {
                pq.decreaseKey(w, distTo[w]);
            } else {
                pq.insert(w, distTo[w]);
            }
        }
    }
}
