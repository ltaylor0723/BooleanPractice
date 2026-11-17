import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {   
        Scanner user = new Scanner(System.in);
        boolean showTestCases = true;
        boolean returnToMenu = true;
        int trollingCounter = 0;
        boolean automaticReturn = false;

        while (returnToMenu) {
            System.out.println("_______\nMENU:\n(1) BMI Calculator\n(2) Grade Calculator\n(3) Factor/Multiple and Even/Odd\n(4) Leap Year Check\n(5) Settings\n(6) Exit\n\nSelect:");
            int selection = user.nextInt();
            Selector.calcSelection select = Selector.Select(selection);
            switch (select) {
                case BMI:
                    ClearScreen.clear();
                    if (showTestCases) {
                        BMICalc Bmi1 = new BMICalc(150, 66);
                        BMICalc Bmi2 = new BMICalc(110, 70);
                        BMICalc Bmi3 = new BMICalc(175, 66);
                        BMICalc Bmi4 = new BMICalc(220, 64);

                        System.out.println("\nBMI Calculator: Test Case #1\n" + Bmi1.WeightHeightReport() + Bmi1.BMIReport());
                        System.out.println("BMI Calculator: Test Case #2\n" + Bmi2.WeightHeightReport() + Bmi2.BMIReport());
                        System.out.println("BMI Calculator: Test Case #3\n" + Bmi3.WeightHeightReport() + Bmi3.BMIReport());
                        System.out.println("BMI Calculator: Test Case #4\n" + Bmi4.WeightHeightReport() + Bmi4.BMIReport());
                    }
                    boolean loop = true;
                    while (loop) {
                        System.out.println("\nPlease input a weight (lb):");
                        double weight = user.nextDouble();
                        System.out.println("Please input a height (in):");
                        double height = user.nextDouble();
                        BMICalc Bmi5 = new BMICalc(weight, height);
                        System.out.println("\nBMI Report for User\n" + Bmi5.WeightHeightReport() + Bmi5.BMIReport());
                        if (!automaticReturn) {
                            System.out.println("\nNew Input (N) or Return to Menu (R)?");
                            String loopInput = user.next();
                            if (loopInput.equalsIgnoreCase("N")) {
                                loop = true;
                            }
                            else {
                                loop = false;
                            }
                        }
                        else {
                            loop = false;
                        }
                    }
                    break;
                
                case GRADE:
                    ClearScreen.clear();
                    if (showTestCases) {
                        GradeCalc Grade1 = new GradeCalc(85, 92, 78);
                        GradeCalc Grade2 = new GradeCalc(90, 90, 90);
                        GradeCalc Grade3 = new GradeCalc(70, 75, 78);
                        GradeCalc Grade4 = new GradeCalc(59, 60, 59);

                        System.out.println("\nGrade Expectations: Test Case #1\n" + Grade1.GradeReport(60,10,30));
                        System.out.println("Grade Expectations: Test Case #2\n" + Grade2.GradeReport(60,10,30));
                        System.out.println("Grade Expectations: Test Case #3\n" + Grade3.GradeReport(60,10,30));
                        System.out.println("Grade Expectations: Test Case #4\n" + Grade4.GradeReport(60,10,30));
                    }

                    loop = true;
                    while (loop) {
                        System.out.println("\nPlease input Test Grade average percentage:");
                        double test = user.nextDouble();
                        System.out.println("Please input Project Grade average percentage:");
                        double project = user.nextDouble();
                        System.out.println("Please input Daily Work Grade average percentage:");
                        double daily = user.nextDouble();
                        GradeCalc Grade5 = new GradeCalc(test, project, daily);

                        int tweight;
                        int pweight;
                        int dweight;
                        System.out.println("Weighting || Use default (D) or custom (C)?");
                        String DorC = user.next();
                        if (DorC.equalsIgnoreCase("C")) {
                            System.out.print("Test Weight: ");
                            tweight = user.nextInt();
                            System.out.print("Project Weight: ");
                            pweight = user.nextInt();
                            System.out.print("Daily Work Weight: ");
                            dweight = user.nextInt();
                        }
                        else {
                            tweight = 60;
                            pweight = 10;
                            dweight = 30;
                        }
                        System.out.println("\nGrade Report for User\n" + Grade5.GradeReport(tweight, pweight, dweight));
                        if (!automaticReturn) {
                            System.out.println("\nNew Input (N) or Return to Menu (R)?");
                            String loopInput = user.next();
                            if (loopInput.equalsIgnoreCase("N")) {
                                loop = true;
                            }
                            else {
                                loop = false;
                            }
                        }
                        else {
                            loop = false;
                        }
                    }
                    break;
                
                case MULTIPLE:
                    ClearScreen.clear();
                    if (showTestCases) {
                        System.out.println("\nMultiple Calculator: Test Case #1\n" + Multiple.isEvenStr(4));
                        System.out.println("Multiple Calculator: Test Case #2\n" + Multiple.isEvenStr(5));
                        System.out.println("Multiple Calculator: Test Case #3\n" + Multiple.isMultipleStr(15, 3));
                        System.out.println("Multiple Calculator: Test Case #4\n" + Multiple.isMultipleStr(17, 3));
                        System.out.println("Multiple Calculator: Test Case #5\n" + Multiple.isFactorStr(4, 15));
                        System.out.println("Multiple Calculator: Test Case #6\n" + Multiple.isFactorStr(7, 14));
                    }

                    loop = true;
                    while (loop) {
                        System.out.println("\nCheck Even/Odd (1)\nCheck Multiple (2)\nCheck Factor (3)\nPlease select an option:");
                        int option = user.nextInt();
                        if (option == 1) {
                            System.out.println("Please input a number:");
                            int number = user.nextInt();
                            System.out.println(Multiple.isEvenStr(number));
                        }
                        else if (option == 2) {
                            System.out.println("Please input a multiple:");
                            int number = user.nextInt();
                            System.out.println("Please input a factor:");
                            int factor = user.nextInt();
                            System.out.println(Multiple.isMultipleStr(number, factor));
                        }
                        else if (option == 3) {
                            System.out.println("Please input a factor:");
                            int factor = user.nextInt();
                            System.out.println("Please input a multiple:");
                            int number = user.nextInt();
                            System.out.println(Multiple.isFactorStr(factor, number));
                        }
                        else {
                            trollingCounter ++;
                            System.out.println("Invalid Option");
                        }
                        if (!automaticReturn) {
                            System.out.println("\nNew Input (N) or Return to Menu (R)?");
                            String loopInput = user.next();
                            if (loopInput.equalsIgnoreCase("N")) {
                                loop = true;
                            }
                            else {
                                loop = false;
                            }
                        }
                        else {
                            loop = false;
                        }
                    }
                    break;
                
                case LEAP:
                    ClearScreen.clear();
                    if (showTestCases) {
                        System.out.println("\nLeap Year Calculator: Test Case #1\n" + LeapYear.isLeapYearStr(2020));
                        System.out.println("Leap Year Calculator: Test Case #2\n" + LeapYear.isLeapYearStr(2021));
                        System.out.println("Leap Year Calculator: Test Case #3\n" + LeapYear.isLeapYearStr(1900));
                        System.out.println("Leap Year Calculator: Test Case #4\n" + LeapYear.isLeapYearStr(2000));
                    }
                    loop = true;
                    while (loop) {
                        System.out.println("\nPlease input a year to check if it's a leap year:");
                        int year = user.nextInt();
                        System.out.println("User's year:\n" + LeapYear.isLeapYearStr(year));
                        if (!automaticReturn) {
                            System.out.println("\nNew Input (N) or Return to Menu (R)?");
                            String loopInput = user.next();
                            if (loopInput.equalsIgnoreCase("N")) {
                                loop = true;
                            }
                            else {
                                loop = false;
                            }
                        }
                        else {
                            loop = false;
                        }
                    }
                    break;
                
                case SETTINGS:
                    ClearScreen.clear();
                    System.out.println("\nSETTINGS:\nShow Test Cases (Y/N)? Default: true, Currently: " + showTestCases);
                    String showTestCasesInput = user.next();
                    if (showTestCasesInput.equalsIgnoreCase("Y")) {
                        showTestCases = true;
                        System.out.println("ShowTestCases Enabled");
                    }
                    else if (showTestCasesInput.equalsIgnoreCase("N")) {
                        showTestCases = false;
                        System.out.println("ShowTestCases Disabled");
                    }
                    System.out.println("Automatically Return to Menu (Y/N)? Default: false, Currently: " + automaticReturn);
                    String autoReturnInput = user.next();
                    if (autoReturnInput.equalsIgnoreCase("Y")) {
                        automaticReturn = true;
                        System.out.println("AutomaticReturn Enabled");
                    }
                    else if (autoReturnInput.equalsIgnoreCase("N")) {
                        automaticReturn = false;
                        System.out.println("AutomaticReturn Disabled");
                    }
                    break;

                case EXIT:
                    ClearScreen.clear();
                    returnToMenu = false;
                    break;

                default: {
                    ClearScreen.clear();
                    trollingCounter ++;
                    if (trollingCounter < 5) {
                        System.out.println("Invalid selection. Please try again.");
                    }
                    else if (trollingCounter == 5) {
                        System.out.println("Invalid selection. Please try again. (This is your last warning, trolling will result in being blocked from the program.)");
                    }
                    else {
                        System.out.println("You have been blocked for trolling (L noob). Please restart the program to try again.");
                        returnToMenu = false;
                    }
                    break;
                }
            }
        }
        System.out.println("Exiting program...");
        user.close();
    }
}