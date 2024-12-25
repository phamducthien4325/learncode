package tuan13;

public class MyDiedge implements Comparable<MyDiedge> {
    private int v;
    private int w;
    private double weight;

    public MyDiedge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public double weight() {
        return weight;
    }

    @Override
    public int compareTo(MyDiedge e) {
        if(this.weight < e.weight) {
            return -1;
        } else if (this.weight > e.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
