package exercise_5;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int[] readElements(int element) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[element];
        for (int i = 0; i < element; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
