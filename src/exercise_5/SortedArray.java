package exercise_5;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int lengthArr) {
        Scanner sc = new Scanner(System.in);
        int[] arrFirst = new int[lengthArr];
        for (int i = 0; i < arrFirst.length; i++) {
            arrFirst[i] = sc.nextInt();
        }
        return arrFirst;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] arrSecond = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrSecond[i] = array[i];
        }
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrSecond.length - 1; i++) {
                if (arrSecond[i] < arrSecond[i + 1]) {
                    temp = arrSecond[i];
                    arrSecond[i] = arrSecond[i + 1];
                    arrSecond[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arrSecond;
    }
}
