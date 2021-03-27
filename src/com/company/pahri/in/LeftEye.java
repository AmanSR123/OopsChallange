package com.company.pahri.in;

import java.util.Scanner;

public class LeftEye {

    private  int leye;
    Scanner in = new Scanner(System.in);

    public void lefteye() {
        System.out.println("Name: Left Eye");
        System.out.println("Medical Condition : Short sighted");
        System.out.println("Color: Blue");
        System.out.println("        1. Close the Eye");

        leye = in.nextInt();

        if (leye == 1) {
            System.out.println("Closing eye");
    }

}}
