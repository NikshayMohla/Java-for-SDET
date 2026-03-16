package OOPS;

public class AdderMain {

    public static void main(String[] args) {
        Adder add = new Adder();
        add.sum();
        add.sum(1, 2);
        add.sum(1, 2, 3);
        add.sum(1.02, 2);
        add.sum(2, 1.02);
//        add.sum(2.01, 1.02);
    }

}