package com.company.pahri.in;

import java.util.Scanner;

public class Skin {

    private int no;
    public void skin() {
        System.out.println("skin komallll");
        Scanner in = new Scanner(System.in);
        System.out.println("presss 1 -> to begin kujana  ");


        no = in.nextInt();

        if (no == 1) {
            System.out.println("kujana begin");
        }
    }
}
