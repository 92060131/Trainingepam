package com.epam.local.tasktwo;

public class MathOutput<T extends Number> {
    public void outputs(String msg,T z){
        System.out.println(msg+ z);
    }
}
