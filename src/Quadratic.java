public class Quadratic {

    public static String Formula(int A, int B, int C, boolean I) {
        double disc = Math.pow(B,2) - 4*A*C;
        if (disc > 0) {
            double x1 = Math.round( ((-B + Math.sqrt(disc)) / (2*A) ) * 100.0)/100.0;
            double x2 = Math.round( ((-B - Math.sqrt(disc)) / (2*A) ) * 100.0)/100.0;
            return "X = " + x1 + " and X = " + x2 + "\n";
        }
        else if (disc == 0) {
            double x = Math.round( ((-B) / (2.0*A) ) * 100.0)/100.0;
            return "X = " + x + "\n";
        }
        else if (I) {
            double r = Math.round( ((-B) / (2.0*A) ) * 100.0)/100.0;
            double c = Math.round( ((-(disc)) / (2*A) ) * 10000.0)/10000.0;
            return "X = " + r + " + " + c + "i" + " and X = " + r + " - " + c + "i\n";
        }
        else {
            return "No real solutions.";
        }
    } 
}
