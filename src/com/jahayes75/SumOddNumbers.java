package com.jahayes75;

public class SumOddNumbers {


    public static boolean isOdd(int number) {
        if (number <= 0) {
            System.out.println("Number is Less than 0");
            return false;
        }
        System.out.println(number);
        return number % 2 != 0;


    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (start < 0) || (end < 0)) {
            return -1;
        }
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;

            }
        }
        System.out.println(sum);
        return sum;
    }


}



