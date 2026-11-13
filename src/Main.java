import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);

        //1. BMI CALC
/*
        BMICalc Bmi1 = new BMICalc(150, 66);
        BMICalc Bmi2 = new BMICalc(110, 70);
        BMICalc Bmi3 = new BMICalc(175, 66);
        BMICalc Bmi4 = new BMICalc(220, 64);

        System.out.println("BMI Calculator: Test Case #1\n" + Bmi1.WeightHeightReport() + Bmi1.BMIReport());
        System.out.println("BMI Calculator: Test Case #2\n" + Bmi2.WeightHeightReport() + Bmi2.BMIReport());
        System.out.println("BMI Calculator: Test Case #3\n" + Bmi3.WeightHeightReport() + Bmi3.BMIReport());
        System.out.println("BMI Calculator: Test Case #4\n" + Bmi4.WeightHeightReport() + Bmi4.BMIReport());

        System.out.println("Please input a weight (lb):");
        double weight = user.nextDouble();
        System.out.println("Please input a height (in):");
        double height = user.nextDouble();
        BMICalc Bmi5 = new BMICalc(weight, height);
        System.out.println("\nBMI Report for User\n" + Bmi5.WeightHeightReport() + Bmi5.BMIReport());
*/
        //-----------------------------------------------------------------------------------------------
        //2. GRADE CALC

        GradeCalc Grade1 = new GradeCalc(85, 92, 78);
        GradeCalc Grade2 = new GradeCalc(90, 90, 90);
        GradeCalc Grade3 = new GradeCalc(70, 75, 78);
        GradeCalc Grade4 = new GradeCalc(59, 60, 59);

        System.out.println("Grade Expectations: Test Case #1\n" + Grade1.GradeReport(60,10,30));
        System.out.println("Grade Expectations: Test Case #2\n" + Grade2.GradeReport(60,10,30));
        System.out.println("Grade Expectations: Test Case #3\n" + Grade3.GradeReport(60,10,30));
        System.out.println("Grade Expectations: Test Case #4\n" + Grade4.GradeReport(60,10,30));

        System.out.println("Please input Test Grade average percentage:");
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
        if (DorC.equals("C")) {
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

    }
}