public class TriangleCalc {
    double sideA;
    double sideB;
    double sideC;

    public TriangleCalc(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public String PythagoreanTheorem() {
        if (sideA <= 0 && !(sideB <= 0 || sideC <= 0)) {
            double solveA = Math.round((Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2))) / 100.0) * 100.0;
            return "Solved for side A, got: " + solveA + ".\n";
        }
        else if (sideB <= 0 && !(sideA <= 0 || sideC <= 0)) {
            double solveA = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2))) / 100.0) * 100.0;
            return "Solved for side A, got: " + solveA + ".\n";
        }
        else if (sideC <= 0 && !(sideA <= 0 || sideB <= 0)) {
            double solveA = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2))) / 100.0) * 100.0;
            return "Solved for side A, got: " + solveA + ".\n";
        }
        else {
            return "It seems like you've entered some funky values, have too many unknown side lengths, or know all the side lengths already.\nPlease try again.\n";
        }
    }

    public String getAngles() {
        double angleA = Math.round((Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC))) / 100.0) * 100.0;
        double angleB = Math.round((Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC))) / 100.0) * 100.0;
        double angleC = Math.round((Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB))) / 100.0) * 100.0;
        return "The angle across from side A is " + angleA + ".\nThe angle across from side B is " + angleB + ".\nThe angle across from side C is " + angleC + ".\n";
    }

}
