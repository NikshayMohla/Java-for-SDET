package OOPS;

class Bank {
    double roi() {
        return 0;
    }
}
//only body should be changed in method overriding no change in return type etc
class ICICI extends Bank {
    double roi() {
        return 10.5;
    }
}

class SBI extends Bank {
    double roi() {
        return 11.5;
    }
}

public class OverridingDemo {

    public static void main(String[] args) {

        ICICI ic = new ICICI();
        System.out.println(ic.roi());

    }

}