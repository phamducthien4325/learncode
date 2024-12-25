package tuan13;

public class MyDigraph {
    private final int V;
    private final MyBag<Integer>[] adj;

    public MyDigraph(int V) {
        this.V = V;
        adj = (MyBag<Integer>[]) new MyBag[V];
        for (int i = 0; i < V; ++i) {
            adj[i] = new MyBag<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }
}
