package exercise_2;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        int firstNum1, lastNum1, firstNum2, lastNum2;
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        firstNum1 = num1 % 10;
        lastNum1 = num1 / 10;
        firstNum2 = num2 % 10;
        lastNum2 = num2 / 10;
        return firstNum1 == firstNum2 || lastNum1 == lastNum2 || lastNum1 == firstNum2 || firstNum1 == lastNum2;
    }
}
