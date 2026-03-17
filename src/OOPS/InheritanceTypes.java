package OOPS;

class A {
    int a;

    void display() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    void show() {
        System.out.println(b);
    }
}

class C extends B {
    int c;

    void print() {
        System.out.println(c);
    }
}

public class InheritanceTypes {

    public static void main(String[] args) {
        B b = new B();
        b.display();

        C c = new C();
        c.display();

        c.a = 100;
        c.b = 500;
        c.c = 1500;

        c.show();
        c.display();
        c.print();


    }

}