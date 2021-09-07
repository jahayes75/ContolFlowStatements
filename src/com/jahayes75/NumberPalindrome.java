package com.jahayes75;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {

        number = Math.abs(number);
        System.out.println(number);
        int number2 = number;
        int reverse = 0;

        while (number2 > 0) {
            reverse = (number2 % 10) + (reverse * 10);
            number2 /= 10;
            System.out.println(number2 + " " + reverse);
        }
        if (number == reverse){
            System.out.println("Number is a Palindrome");
        }else {
            System.out.println("Number is not a Palindrome");
        }
        return number == reverse;

    }
}
