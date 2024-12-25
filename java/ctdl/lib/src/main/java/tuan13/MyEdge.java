package tuan13;

public class MyEdge implements Comparable<MyEdge> {
    private int v;
    private int w;
    private double weight;

    public MyEdge(int v, int w, int weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either() {
        return v;
    }

    public int other(int s) {
        if(s == v) {
            return w;
        }
        return v;
    }

    @Override
    public int compareTo(MyEdge e) {
        if(this.weight > e.weight) {
            return 1;
        } else if(this.weight < e.weight) {
            return -1;
        } else {
            return 0;
        }
    }
}
