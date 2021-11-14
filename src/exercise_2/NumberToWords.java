package exercise_2;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        int numReverse = reverse(number);
        int leadingZeroes = getDigitCount(number) - getDigitCount(numReverse);

        while (numReverse > 0) {
            int lastDigit = numReverse % 10;
            if (lastDigit == 0) {
                System.out.println("Zero");
            } else if (lastDigit == 1) {
                System.out.println("One");
            } else if (lastDigit == 2) {
                System.out.println("Two");
            } else if (lastDigit == 3) {
                System.out.println("Three");
            } else if (lastDigit == 4) {
                System.out.println("Four");
            } else if (lastDigit == 5) {
                System.out.println("Five");
            } else if (lastDigit == 6) {
                System.out.println("Six");
            } else if (lastDigit == 7) {
                System.out.println("Seven");
            } else if (lastDigit == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
            numReverse = numReverse / 10;
        }
        if (leadingZeroes > 0) {
            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
