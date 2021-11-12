package exercise_2;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start) {
            return -1;
        } else if (end < 0 || start < 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
