package com.jahayes75;

public class NumbersToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int digitCountNumber = getDigitCount(number);

        int lastDigit = 0;

        while (digitCountNumber > 0) {
            lastDigit = reversedNumber % 10;
            reversedNumber /= 10;
            digitCountNumber--;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum++;
            number /= 10;
        }
        return sum;
    }
}

