package OOPS;

public class ThisKeyword {
    int x, y;

    ThisKeyword(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword(5, 6);
        System.out.println(th.x);
        System.out.println(th.y);
    }

}