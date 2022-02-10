package com.epam.local.tasknone;
public class MathController {
    public static void main(String[] args) {
        MathInit.initOne();
        double z=MathLogic.countOne(MathInit.a,MathInit.b,MathInit.c);
        MathOutput.outputOne(z);
        MathInit.initTwo();
        int k=MathLogic.countTwo(MathInit.f,MathInit.g,MathInit.h);
        MathOutput.outputTwo(k);
    }
}
