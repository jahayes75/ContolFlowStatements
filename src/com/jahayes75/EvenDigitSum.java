package com.jahayes75;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println("Number is a Negative number");
            return -1;
        }
        int sum = 0;
        System.out.println(number);
        while (number > 0) {
            if (number % 2 == 0) { // checks for even number
                sum += number % 10;//adds the remainder of number to sum
            }
            number /= 10; //reduces number by one decimal point by setting number equal to number divided by 10.
        }
        System.out.println(" The sum of even numbers = " + sum);
        return sum; //returns sum of all even numbers processed by loop
    }
}