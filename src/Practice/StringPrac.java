package Practice;

import java.util.Scanner;

public class StringPrac {
    public static String reverse(String str) {
        StringBuilder st = new StringBuilder(str);
        st.reverse();
//        System.out.println(st);
        str = st.toString();
        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] str1 = str.split(" ");
//        for (String it : str1) {
//            System.out.println(it);
//        }
        String ans = "";
        for (String it : str1) {
            ans += reverse(it) + " ";
        }
        System.out.println(ans);
    }

}