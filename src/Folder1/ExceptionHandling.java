package Folder1;

import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Started");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Running");
        try {
            System.out.println(100 / num);//Arithmetic Exception

//        } catch (ArithmeticException e) {
//            System.out.println("Invalid Data");
//        }
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("Completed");
        System.out.println("Ended");
    }

}