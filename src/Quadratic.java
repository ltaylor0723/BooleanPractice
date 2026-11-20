public class Quadratic {
    int A;
    int B;
    int C;
    boolean showImaginary;

    public class Quadratic(int a, int b, int c, boolean I) {
        A = a;
        B = b;
        C = c;
        showImaginary = I;
    }

    public String Formula() {
        if (Math.pow(B,2) - 4*A*C > 0) {
            double x1 = Math.round( ((-B + Math.sqrt(Math.pow(B,2) - 4*A*C)) / (2*A) ) * 100.0)/100.0;
            double x2 = Math.round( ((-B - Math.sqrt(Math.pow(B,2) - 4*A*C)) / (2*A) ) * 100.0)/100.0;
            return "X = " + x1 + " and X = " + x2;
        }
        else if (Math.pow(B,2) - 4*A*C = 0) {
            double x = Math.round( ((-B) / (2*A) ) * 100.0)/100.0;
            return "X = " + x;
        }
        else if (showImaginary) {
            double r = Math.round( ((-B) / (2*A) ) * 100.0)/100.0;
            double c = Math.round( ((-(Math.pow(B,2) - 4*A*C > 0)) / (2*A) ) * 10000.0)/10000.0;
            return "X = " + r + " + " + c + "i" + " and X = " + r + " - " + c + "i";
        }
        else {
            return "No real solutions.";
        }
    } 
}
