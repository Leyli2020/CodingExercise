package exercise_2;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        number = Math.abs(number);
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return number == reverse;
    }
}
