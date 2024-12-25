package tuan13;

public class MyEdgeWeightedDigraph {
    private final int V;
    private final MyBag<MyDiedge>[] adj;

    public MyEdgeWeightedDigraph(int v) {
        V = v;
        adj = (MyBag<MyDiedge>[]) new MyBag[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new MyBag<>();
        }
    }

    public void addEdge(MyDiedge e) {
        int v = e.from();
        adj[v].add(e);
    }

    public Iterable<MyDiedge> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }

}
