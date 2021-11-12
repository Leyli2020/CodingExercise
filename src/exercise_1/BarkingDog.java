package exercise_1;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking == true && hourOfDay < 8) {
            return true;
        } else if (barking == true && hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }
}
