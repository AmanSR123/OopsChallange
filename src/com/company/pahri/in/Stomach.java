package com.company.pahri.in;

import java.util.Scanner;

public class Stomach {
    private int no;
    public void stomach() {
        System.out.println("Digestion");
        Scanner in = new Scanner(System.in);
        System.out.println("presss 1 -> to begin digestion ");


        no = in.nextInt();

        if (no == 1) {
            System.out.println("Digestion begin");
        }
    }
}
