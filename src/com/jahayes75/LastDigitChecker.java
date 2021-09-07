package com.jahayes75;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            if ((num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10)) {
                System.out.println(num1 + " & " + num2 + " & " + num3 + " have same last digit.");
                return true;
            } else {
                System.out.println("Numbers do not have same last digit.");

            }
        }
        return false;
    }
        public static boolean isValid ( int num){
            return (num >= 10 && num <= 1000);
        }
}
