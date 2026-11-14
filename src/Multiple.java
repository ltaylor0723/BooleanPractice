public class Multiple {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isMultiple(int number, int factor) {
        if (number % factor == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isFactor(int factor, int number) {
        if (number % factor == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String isEvenStr(int number) {
        if (number % 2 == 0) {
            return "Is "+number+" even?\nEVEN\n";
        }
        else {
            return "Is "+number+" even?\nODD\n";
        }
    }

    public static String isMultipleStr(int number, int factor) {
        if (number % factor == 0) {
            return "Is "+number+" a multiple of "+factor+"?\nTRUE\n"+factor+" * "+(number/factor)+" = "+number+"\n";
        }
        else {
            return "Is "+number+" a multiple of "+factor+"?\nFALSE\n";
        }
    }

    public static String isFactorStr(int factor, int number) {
        if (number % factor == 0) {
            return "Is "+factor+" a factor of "+number+"?\nTRUE\n"+factor+" * "+(number/factor)+" = "+number+"\n";
        }
        else {
            return "Is "+factor+" a factor of "+number+"?\nFALSE\n";
        }
    }
}
