package exercise_1;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int num1 = (int) (d1 * 1000);
        int num2 = (int) (d2 * 1000);
        if (num1 == num2) {
            return true;
        } else return false;
    }
}
