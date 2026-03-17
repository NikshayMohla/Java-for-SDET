package Practice;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] st = str.split(" ");
        int start = 0;
        int e = st.length - 1;

        while (start < e) {
            String tem = st[start];
            st[start] = st[e];
            st[e] = tem;
            start++;
            e--;
        }
        StringBuilder ans = new StringBuilder();
        for (String it : st) {
            ans.append(it).append(" ");
        }
        System.out.println(ans);
    }
}