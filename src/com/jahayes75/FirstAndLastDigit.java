package com.jahayes75;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        System.out.println(number);
        int lastDigit = number % 10; // extracts last digit
        while (number > 9) {
            number /= 10; // number is equal to number/10 until number is less than 10 returning 1st digit

        }
        System.out.println("First Digit " + number + " + Last Digit " + lastDigit + " = " + (number + lastDigit));
        return lastDigit + number;

    }
}


