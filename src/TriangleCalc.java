public class TriangleCalc {
    double sideA = 0;
    double sideB = 0;
    double sideC = 0;
    int angleA = 0;
    int angleB = 0;
    int angleC = 0;


    public TriangleCalc(double a, double b, double c) {
        //Three known sides, or two known sides and an unknown side with a length >= 0
        //SSS
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public TriangleCalc(double a, double b, int c) {
        //Side1, side2, and the angle between them
        //SAS
        sideA = a;
        sideB = b;
        angleA = c;
    }

    public TriangleCalc(double a, int b, int c) {
        //A single side, and the angles on either end of that side
        //ASA(A)
        sideA = a;
        angleA = b;
        angleB = c;
        angleC = 180 - angleA - angleB;
    }

    public TriangleCalc(int a, int b, int c) {
        //All the angles
        //AAA
        angleA = a;
        angleB = b;
        angleC = c;
    }

    public String PythagoreanTheorem() {
        if (sideA <= 0 && !(sideB <= 0 || sideC <= 0)) {
            double solveA = Math.round((Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2))) / 100.0) * 100.0;
            return "Solved for side A, got: " + solveA + ".\n";
        }
        else if (sideB <= 0 && !(sideA <= 0 || sideC <= 0)) {
            double solveB = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2))) / 100.0) * 100.0;
            return "Solved for side B, got: " + solveB + ".\n";
        }
        else if (sideC <= 0 && !(sideA <= 0 || sideB <= 0)) {
            double solveC = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2))) / 100.0) * 100.0;
            return "Solved for side C, got: " + solveC + ".\n";
        }
        else {
            return "It seems like you've entered some funky values, have too many unknown side lengths, or know all the side lengths already.\nPlease try again.\n";
        }
    }

    public String getAnglesSSS() {
        double angA;
        double angB;
        double angC;
        if (sideA > 0 && sideB > 0) {
            angA = Math.round((Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC))) / 100.0) * 100.0;
            angB = Math.round((Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC))) / 100.0) * 100.0;
            angC = 180.0 - angA - angB;
            return "The angle across from side A is " + angA + ".\nThe angle across from side B is " + angB + ".\nThe angle across from side C is " + angC + ".\n";
        }
        else if (sideA > 0 && sideC > 0) {
            angA = Math.round((Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC))) / 100.0) * 100.0;
            angC = Math.round((Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB))) / 100.0) * 100.0;
            angB = 180.0 - angA - angC;
            return "The angle across from side A is " + angA + ".\nThe angle across from side B is " + angB + ".\nThe angle across from side C is " + angC + ".\n";
        }
        else if (sideB > 0 && sideC > 0) {
            angB = Math.round((Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC))) / 100.0) * 100.0;
            angC = Math.round((Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB))) / 100.0) * 100.0;
            angA = 180.0 - angB - angC;
            return "The angle across from side A is " + angA + ".\nThe angle across from side B is " + angB + ".\nThe angle across from side C is " + angC + ".\n";
        }
        else {
            return "Sorry, not enough information.";
        }
    }

    public String getMissingAnglesSAS() {
        if () {

        }
    }

    public String getSidesAAA() {
        //Proportions of the sides to each other based on the angles
        double sA = 1;
        double sB = sA * Math.sin(angleB) / Math.sin(angleA);
        double sC = sA * Math.sin(angleC) / Math.sin(angleA);
        return "The proportions of the sides, a:b:c, is " + sA + ":" + sB + ":" + sC + "\n";
    }

}
