package com.company.pahri.in;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 1;
        int no;
        Scanner in = new Scanner(System.in);

        LeftEye leye = new LeftEye();
        RightEye reye = new RightEye();
        Heart heart = new Heart(65);
        Stomach stomach = new Stomach();
        Skin skin = new Skin();

        while (i == 1) {
            System.out.println("Choose an Organ");
            System.out.println("1. Left Eye");
            System.out.println("2. Right Eye");
            System.out.println("3. Heart");
            System.out.println("4. Stomach");
            System.out.println("5. Skin");
            System.out.println("6. Quit");
            no = in.nextInt();
            switch (no) {
                case 1: leye.lefteye();

                    break;
                case 2:
                    reye.righteye();
                    break;
                case 3:
                    heart.heart();
                    break;
                case 4:
                    stomach.stomach();
                    break;
                case 5:
                    skin.skin();
                    break;
                case 6:
                    i++;
                    break;

            }
        }
        System.out.println("Exiting>>>>");
    }
}
