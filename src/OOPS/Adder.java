package OOPS;

public class Adder {
    int a = 10;
    int b = 20;

    //    Method Overloading
//    in overloading we dont consider the return types we only consider variables
    void sum() {
        System.out.println(a + b);
    }

    void sum(int x, int y) {
        System.out.println(x + y);
    }

    void sum(int g, double h) {
        System.out.println(g + h);
    }

    void sum(double h, int g) {
        System.out.println(g + h);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}