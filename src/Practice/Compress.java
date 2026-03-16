package Practice;

import java.util.*;
import java.util.Map;
import java.util.LinkedHashMap;

public class Compress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
//        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
//        for (char it : arr) {
//            mp.put(it, mp.getOrDefault(it, 0) + 1);
//        }
//        StringBuilder ans = new StringBuilder();
//        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//            ans.append(key).append(value);
//        }
//        String ne = ans.toString();
//        if(ne.length()<str.length()) System.out.println(ne);
//        else System.out.println(str);
        int count = 1;
        StringBuilder st = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) count++;
            else {
                st.append(arr[i - 1]).append(count);
                count = 1;
            }
        }
        st.append(arr[arr.length - 1]).append(count);
        System.out.println(st);

    }

}