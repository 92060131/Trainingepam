package com.epam.local.tasknone;

public class MathLogic {
    public static double countDouble(double a,double b,double c){
    double z=(b+Math.sqrt(b*b+4*a*c))/2*a-a*a*a*c+Math.pow(b,-2);
    return z;
}
    public static int countInt(int a,int b,int c){
        int z=(b+(int)(Math.sqrt(b*b+4*a*c)))/2*a-a*a*a*c+(int)Math.pow(b,-2);
        return z;
    }
}
