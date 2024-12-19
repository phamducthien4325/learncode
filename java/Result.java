import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Result {
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> b = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; --i) {
            b.add(a.get(i));
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            a.add(x);
        }
        List<Integer> b = reverseArray(a);
        for (int i = 0; i < b.size(); ++i) {
            System.out.println(b.get(i));
        }
        sc.close();
    }
}
