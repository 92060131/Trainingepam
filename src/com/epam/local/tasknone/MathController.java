package com.epam.local.tasknone;

import com.epam.local.tasktwo.MathInit;

public class MathController {
    public static void main(String[] args) {
        MathInit in= new MathInit();
        int a=in.initsInt(" a=");
        int b=in.initsInt(" b=");
        int c=in.initsInt(" c=");
        int z=MathLogic.countInt(a,b,c);
        MathOutput.outputTwo(z);
        double g=in.initsDouble(" g=");
        double d=in.initsDouble(" d=");
        double h=in.initsDouble(" h=");
        double k=MathLogic.countDouble(h,g,d);
        MathOutput.outputOne(k);
    }
}
