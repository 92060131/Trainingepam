package com.epam.local.tasktwo;

import java.util.Scanner;

public class MathInit {
    public static double a,b;
    public static int k,m;
    public static void initOne(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Катет a :");
        a=scan.nextDouble();
        System.out.print("Катет b :");
        b=scan.nextDouble();
    }
    public static void initTwo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Катет k :");
        k=scan.nextInt();
        System.out.print("Катет m :");
        m=scan.nextInt();
    }
}
