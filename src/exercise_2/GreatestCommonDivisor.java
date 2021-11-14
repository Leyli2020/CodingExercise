package exercise_2;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int num = 0;
        if (first < 10 || second < 10) {
            return -1;
        }
        int min=Math.min(first, second);
        for (int i = 2; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                num = i;
            }
        }
        return num;
    }
}
