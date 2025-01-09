package bai1;

public class test2 extends test{
    @Override
    public void in() {
        System.out.println("test2");
    }

    public static void main(String[] args) {
        test a = new test2();
        a.in();
    }
}
