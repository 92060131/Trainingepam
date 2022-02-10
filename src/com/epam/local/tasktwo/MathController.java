package com.epam.local.tasktwo;


public class MathController {
    public static void main(String[] args) {
        MathInit.initOne();
        double z=MathLogic.countOne(MathInit.a, MathInit.b);
        MathOutput.outputOne(z);
        MathInit.initTwo();
        int k= MathLogic.countTwo(MathInit.k,MathInit.m);
        MathOutput.outputTwo(k);
    }

}
