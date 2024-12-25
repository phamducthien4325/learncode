package tuan13;

public class MyEdgeWeightedGraph {
    private final int V;
    private final MyBag<MyEdge>[] adj;

    public MyEdgeWeightedGraph(int v) {
        V = v;
        adj = (MyBag<MyEdge>[]) new MyBag[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new MyBag<>();
        }
    }

    public void addEdge(MyEdge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
    }

    public Iterable<MyEdge> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }
}
