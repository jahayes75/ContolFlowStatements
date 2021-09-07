package com.jahayes75;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {

        int sumOfProperDivisors = 0;
        if (number > 1) {
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    System.out.println(sumOfProperDivisors);
                    sumOfProperDivisors += i;
                    //System.out.println(sumOfProperDivisors);
                }

            }
            System.out.println(sumOfProperDivisors);
            return sumOfProperDivisors == number;
        }
        return false;
    }
}