package com.epam.local.tasknone;

import java.util.Scanner;

public class MathInit {
    public static double a,b,c;
    public static int f,g,h;
    public static void initOne() {
        System.out.println("Введите значения переменных a,b,c :");
        Scanner scan = new Scanner(System.in);
         a = scan.nextDouble();
         b = scan.nextDouble();
         c = scan.nextDouble();
    }
    public static void initTwo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения переменных f,g,h :");
        f = scan.nextInt();
        g = scan.nextInt();
        h = scan.nextInt();
    }

}
