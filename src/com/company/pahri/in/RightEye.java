package com.company.pahri.in;

import java.util.Scanner;

public class RightEye {

    private  int reye;
    Scanner in = new Scanner(System.in);

    public void righteye() {
        System.out.println("Name: Left Eye");
        System.out.println("Medical Condition : Short sighted");
        System.out.println("Color: Blue");
        System.out.println("        1. Close the Eye");

        reye = in.nextInt();

        if (reye == 1) {
            System.out.println("Closing eye");
        }

    }}
