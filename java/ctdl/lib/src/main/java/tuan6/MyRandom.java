package tuan6;

import java.util.Random;

public class MyRandom {
    public static void suffle(Object[] a) {
        int n = a.length;
        Random rand = new Random();
        for (int i = 1; i < n; ++i) {
            int j = rand.nextInt(i);
            exch(a, i, j);
        }
    }

    private static void exch(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
