package com.epam.local.tasktwo;

import java.util.Scanner;

public class MathInit {
   private final Scanner scan = new Scanner(System.in);
    public int initsInt(String msg) {
        System.out.print(msg);
        int a=0;
        if(!scan.hasNextInt()){
            throw new IllegalArgumentException("Incorrect data input,please use int type");
        }
        a=scan.nextInt();
        return a;
    }
    public double initsDouble(String msg){
        System.out.print(msg);
        double a=0;
        if(!scan.hasNextDouble()){
            throw new IllegalArgumentException("Incorrect data input,please use double type");
        }
            a=scan.nextDouble();
        return a;
    }
}
