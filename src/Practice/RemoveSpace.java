package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveSpace {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.replace(" ", "");
        System.out.println(str);
    }

}