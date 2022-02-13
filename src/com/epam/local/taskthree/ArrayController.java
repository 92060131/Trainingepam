package com.epam.local.taskthree;

public class ArrayController {
    public static void main(String[] args) {
        int []arr=ArrayInit.push();
        int []result=ArrayLogic.logicCount(arr);
        ArrayOut.showResult("Результат :",result);
    }
}
