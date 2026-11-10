public class BMICalc {

    double pounds;
    double inches;
    double bmi;

    public BMICalc(double w, double h) {
            pounds = w;
            inches = h;
            double unrounded = (703*pounds) / (Math.pow(inches, 2));
            bmi = Math.round(unrounded * 100) / 100.0;
    }

    public String WeightHeightReport() {
        return "Weight (lb): " + pounds + "\nHeight (in): " + inches + "\n";
    }

    public String BMIReport() {
        if (bmi > 30) {
            return "BMI: " + bmi + "\nCatergory: Obese\n";
        }
        else if (bmi >= 25) {
            return "BMI: " + bmi + "\nCatergory: Overweight\n";
        }
        else if (bmi >= 18.5) {
            return "BMI: " + bmi + "\nCatergory: Healthy\n";
        }
        else if (bmi < 18.5) {
            return "BMI: " + bmi + "\nCatergory: Underweight\n";
        }
        else return "No Info\n";
    }
}
