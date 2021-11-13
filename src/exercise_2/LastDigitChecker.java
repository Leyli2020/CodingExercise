package exercise_2;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int rightmostNum1, rightmostNum2, rightmostNum3;
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }
        rightmostNum1 = num1 % 10;
        rightmostNum2 = num2 % 10;
        rightmostNum3 = num3 % 10;
        return rightmostNum1 == rightmostNum2 || rightmostNum2 == rightmostNum3 || rightmostNum1 == rightmostNum3;
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
