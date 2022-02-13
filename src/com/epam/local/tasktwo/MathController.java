package com.epam.local.tasktwo;


public class MathController {
    public static void main(String[] args) {
        MathInit in= new MathInit();
        MathOutput out=new MathOutput();
        int a=in.initsInt("Катет a=");
        int b=in.initsInt("Катет b=");
        int z=MathLogic.countIntPerimeter(a,b);
        int g=MathLogic.countIntSquare(a,b);
        out.outputs("Периметр=",z);
        out.outputs("Площадь=",g);
        double c=in.initsDouble("Катет c=");
        double d=in.initsDouble("Катет d=");
        double k= MathLogic.countDoublePerimeter(c,d);
        double n=MathLogic.countDoubleSquare(c,d);
        out.outputs("Периметр=",k);
        out.outputs("Площадь=",n);
    }

}
