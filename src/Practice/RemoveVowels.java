package Practice;

import java.util.*;

public class RemoveVowels {
    public static String remove(String str) {

        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('a', 1);
        mp.put('e', 1);
        mp.put('i', 1);
        mp.put('o', 1);
        mp.put('u', 1);
        String ans = "";
        for (char it : arr) {
            if (!mp.containsKey(it)) {
                ans += it;
            }
        }
        System.out.println(ans);
    }

}