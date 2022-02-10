package com.epam.local.taskfour;
import com.epam.local.taskthree.ArrayInit;

public class ArrayController {
    public static void main(String[] args) {
        int []arr=ArrayInit.push();
        int max=ArrayLogic.maxIndexSearch(arr);
        int min=ArrayLogic.minIndexSearch(arr);
        ArrayOutput.showMinMax(min,max,arr);
    }
}
