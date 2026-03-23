package Folder1;

import java.util.*;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(1);
        System.out.println(2);
        Thread.sleep(5000);

        //Only for Checked exceptions(sleep fileIO)


        System.out.println(3);
        System.out.println(4);
    }

}