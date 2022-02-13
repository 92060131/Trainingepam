package com.epam.local.tasktwo;

import java.util.Scanner;

public class MathInit {
   private final Scanner scan = new Scanner(System.in);
    public int initsInt(String msg)throws IllegalArgumentException {
        System.out.print(msg);
        int a=0;
        if(scan.hasNextInt()){
        a=scan.nextInt();
        }else{
            throw new IllegalArgumentException("Incorrect data input");
        }
        return a;
    }
    public double initsDouble(String msg)throws IllegalArgumentException{
        System.out.print(msg);
        double a=0;
        if(scan.hasNextDouble()){
            a=scan.nextDouble();
        }else {
            throw new IllegalArgumentException("Incorrect data input");}
        return a;
    }
}
