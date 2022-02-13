package com.epam.local.tasktwo;

public class MathLogic {
    public static double countDoublePerimeter(double a,double b){
            double z = a + b + Math.sqrt(a * a + b * b);
            return z;
    }
    public static int countIntPerimeter(int a,int b){
        int z=a+b+(int)Math.sqrt(a*a+b*b);
        return z;
    }
    public static int countIntSquare(int a,int b){
        int z=(a*b)/2;
        return z;
    }
    public static double countDoubleSquare(double a,double b){
        double z=(a*b)/2;
        return z;
    }

}
