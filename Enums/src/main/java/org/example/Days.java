package org.example;

import java.util.Arrays;

public enum Days  {
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);

    public void setNumberRepresentation(int numberRepresentation) {
    }

    private Days(int i) {
    }

    public static void main(String[] args) {
        Days dayObject = Days.MON;
        Days dayObject1 = Days.FRI;
        System.out.println(dayObject.name());
        System.out.println(dayObject.ordinal());
        System.out.println(dayObject.compareTo(dayObject1));
        System.out.println(Days.valueOf("MON"));

    }
}
