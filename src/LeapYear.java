public class LeapYear {
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public static String isLeapYearStr(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return year + " is a leap year.\n";
                }
                else {
                    return year + " is not a leap year.\n";
                }
            }
            else {
                return year + " is a leap year.\n";
            }
        }
        else {
            return year + " is not a leap year.\n";
        }
    }
}
