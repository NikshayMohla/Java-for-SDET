package OOPS;

public class MainOverloading {
    void main(int x) {
        System.out.println(x);
    }

    void main(String s) {
        System.out.println(s);
    }

    void main(String x, String y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        MainOverloading main1 = new MainOverloading();
        main1.main(100);
        main1.main("John");
        main1.main("Jon", "Ron");
    }

}