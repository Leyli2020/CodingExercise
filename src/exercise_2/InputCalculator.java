package exercise_2;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;

        while (true) {
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                count++;
                int number = sc.nextInt();
                sum += number;
                average = Math.round((double) sum / (double) count);
            } else break;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        sc.close();

    }
}
