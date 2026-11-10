import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);

        //1. BMI CALC

        BMICalc Bmi1 = new BMICalc(150, 66);
        BMICalc Bmi2 = new BMICalc(110, 70);
        BMICalc Bmi3 = new BMICalc(175, 66);
        BMICalc Bmi4 = new BMICalc(220, 64);

        System.out.println("BMI Calculator: Test Case #1\n" + Bmi1.WeightHeightReport() + Bmi1.BMIReport());
        System.out.println("BMI Calculator: Test Case #2\n" + Bmi2.WeightHeightReport() + Bmi2.BMIReport());
        System.out.println("BMI Calculator: Test Case #3\n" + Bmi3.WeightHeightReport() + Bmi3.BMIReport());
        System.out.println("BMI Calculator: Test Case #4\n" + Bmi4.WeightHeightReport() + Bmi4.BMIReport());

        System.out.println("Please input a weight (lb)");
        double weight = user.nextDouble();
        System.out.println("Please input a height (in)");
        double height = user.nextDouble();
        BMICalc Bmi5 = new BMICalc(weight, height);
        System.out.println("\nBMI Report for User\n" + Bmi5.WeightHeightReport() + Bmi5.BMIReport());

        //-----------------------------------------------------------------------------------------------
        //2. GRADE CALC

    }
}