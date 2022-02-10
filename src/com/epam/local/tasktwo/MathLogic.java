package com.epam.local.tasktwo;

import java.util.Scanner;

public class MathLogic {
    public static double countOne(double a,double b){
            System.out.println("Подсчет периметра или площади? p/s?");
            Scanner scan = new Scanner(System.in);
            String c = scan.nextLine();
            double z = c.equals("p") ? (a + b + Math.sqrt(a * a + b * b)) : (a * b) / 2;
            return z;
    }
    public static int countTwo(int a,int b){
        System.out.println("Подсчет периметра или площади? p/s?");
        Scanner scan=new Scanner(System.in);
        String c= scan.nextLine();
        int z=c.equals("p")?(a+b+(int)(Math.sqrt(a*a+b*b))):(a*b)/2;
        return z;
    }
}
