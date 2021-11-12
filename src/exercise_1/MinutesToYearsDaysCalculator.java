package exercise_1;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = (long) minutes / 60;
            long day = (long) hour / 24;
            long year = (long) day / 365;
            System.out.println(minutes + " min = " + year + " y and " + (day - year * 365) + " d");
        }
    }
}
