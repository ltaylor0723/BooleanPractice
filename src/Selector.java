public class Selector {

    public enum calcSelection {
            BMI,
            GRADE,
            MULTIPLE,
            LEAP,
            TRIANGLECALC,
            QUADRATIC,
            SETTINGS,
            EXIT,
            INVALID
        }
    public static calcSelection Select(int s) {
        if (s == 1) {
            return calcSelection.BMI;
        }
        else if (s == 2) {
            return calcSelection.GRADE;
        }
        else if (s == 3) {
            return calcSelection.MULTIPLE;
        }
        else if (s == 4) {
            return calcSelection.LEAP;
        }
        else if (s == 5) {
            return calcSelection.TRIANGLECALC;
        }
        else if (s == 6) {
            return calcSelection.QUADRATIC;
        }
        else if (s == 7) {
            return calcSelection.SETTINGS;
        }
        else if (s == 8) {
            return calcSelection.EXIT;
        }
        else {
            return calcSelection.INVALID;
        }
    }

}
