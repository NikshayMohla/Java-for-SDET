package Practice;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();


        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < st.length(); i++) {
            hs.add(st.charAt(i));
        }
        String ans="";
        for (char it : hs) {
            ans+=it;
        }
        System.out.println(ans);
    }

}