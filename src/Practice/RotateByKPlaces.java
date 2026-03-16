package Practice;

import java.util.Scanner;

public class RotateByKPlaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder st = new StringBuilder();
        int k = sc.nextInt();
        k = k % str.length();
        st.append(str.substring(k));
        st.append(str.substring(0, k));

        System.out.println(st);
    }

}