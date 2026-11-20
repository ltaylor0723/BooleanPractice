public class TriangleCalc {
    double sideA = 0;
    double sideB = 0;
    double sideC = 0;
    int angleA = 0;
    int angleB = 0;
    int angleC = 0;


    public TriangleCalc(double a, double b, double c) {
        //Three known sides, or two known sides and an unknown side with a length <= 0
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
        angleC = c;
    }

    public TriangleCalc(int a, int b, int c) {
        //All the angles
        //AAA
        angleA = a;
        angleB = b;
        angleC = c;
    }

    public TriangleCalc(double a, double b, double c, int d, int e, int f) {
        //Any and all known
        sideA = a;
        sideB = b;
        sideC = c;
        angleA = d;
        angleB = e;
        angleC = f;
    }

    public String PythagoreanTheorem() {
        if (sideA <= 0 && !(sideB <= 0 || sideC <= 0)) {
            double solveA = Math.round((Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2))) * 100.0) / 100.0;
            sideA = solveA;
            return "Solved for side A, got: " + solveA + ".\n";
        }
        else if (sideB <= 0 && !(sideA <= 0 || sideC <= 0)) {
            double solveB = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2))) * 100.0) / 100.0;
            sideB = solveB;
            return "Solved for side B, got: " + solveB + ".\n";
        }
        else if (sideC <= 0 && !(sideA <= 0 || sideB <= 0)) {
            double solveC = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2))) * 100.0) / 100.0;
            sideC = solveC;
            return "Solved for side C, got: " + solveC + ".\n";
        }
        else {
            return "Error: Not enough information, or invalid inputs.\nPlease try again.\n";
        }
    }

    public String getAnglesSSS() {
        int angA;
        int angB;
        int angC;
        if (sideA > 0 && sideB > 0) {
            angA = Math.round((float)(Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)))));
            angB = Math.round((float)(Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)))));
            angC = 180 - angA - angB;
            }
        else if (sideA > 0 && sideC > 0) {
            angA = Math.round((float)(Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)))));
            angC = Math.round((float)(Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)))));
            angB = 180 - angA - angC;
            }
        else if (sideB > 0 && sideC > 0) {
            angB = Math.round((float)(Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)))));
            angC = Math.round((float)(Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)))));
            angA = 180 - angB - angC;
        }
        else {
            return "Error: Not enough information, or invalid inputs.\nPlease try again.\n";
        }
        angleA = angA;
        angleB = angB;
        angleC = angC;
        return "The angle across from side A is " + angA + ".\nThe angle across from side B is " + angB + ".\nThe angle across from side C is " + angC + ".\n";
    }

    public String getMissingAnglesSAS() {
        sideC = Math.round((Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - (sideA*sideB*2*Math.cos(Math.toRadians(angleC))))) * 100.0) / 100.0;
        angleA = Math.round((float) Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC))));
        angleB = 180 - angleC - angleA;
        return "Side C is "+sideC+".\nThe angle across from side A is " + angleA + ".\nThe angle across from side B is " + angleB + ".\n";
    }

    public String getSidesProportionsAAA() {
        //Proportions of the sides to each other based on the angles
        if (!(angleA <= 0 || angleB <= 0 || angleC <= 0)){
            double sA = 1;
            double sB = Math.round(sA * (Math.sin(Math.toRadians(angleB))) / (Math.sin(Math.toRadians(angleA)))*10000.0)/10000.0;
            double sC = Math.round(sA * (Math.sin(Math.toRadians(angleC))) / (Math.sin(Math.toRadians(angleA)))*10000.0)/10000.0;
            return "The proportions of the sides, a:b:c, is " + sA + ":" + sB + ":" + sC + "\n";
        }
        else {
            return "Error: Not enough information, or invalid inputs.\nPlease try again.\n";
        }
    }

}
