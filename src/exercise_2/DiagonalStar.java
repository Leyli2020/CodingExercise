package exercise_2;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            int j = 1;
            while (i <= number) {
                while (j <= number) {
                    if ((i == 1) || (i == number) || j == i || (j == 1) || (j == number) || (j == number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                }
                j = 1;
                i++;
                System.out.println();
            }
        }
    }
}
