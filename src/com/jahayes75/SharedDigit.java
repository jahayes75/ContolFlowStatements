package com.jahayes75;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            System.out.println("Number is not within a Valid range");
            return false;
        }
        if (((x / 10 == y / 10) || (x / 10 == y % 10) || (y / 10 == x % 10) || (x % 10 == y % 10))) {
            System.out.println(x + " & " + y + " have a shared digit.");
        }
        else{
            System.out.println(x +" & " + y + " Do not have a shared digit." );
    }
        return false;
    }
}