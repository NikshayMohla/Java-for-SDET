package OOPS;

class Test {
    int x = 100;
//    final int y=199;
}

public class FinalKeyword {

    public static void main(String[] args) {
        Test t = new Test();
        t.x = 10000000;
//        t.y = 10000000;//final cannot be changed

        System.out.println(t.x);
    }

}