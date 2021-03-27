package com.company.pahri.in;
import java.util.Scanner;

public class Heart {

    private int pulse ;
    Scanner in = new Scanner(System.in);

    public Heart(int pulse) {
        this.pulse = pulse;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public void heart() {
        System.out.println("Heart");
        System.out.println("Medical Condition: Normal ");
        System.out.println("Heart rate: "+pulse);
        System.out.println("1. Change the heart Rate");

        int no = in.nextInt();

        if (no == 1) {
            System.out.println("enter new Heart rate");
            no = in.nextInt();
            this.pulse = no;
        }
    }



}
