public class GradeCalc {
    //A bit long, but makes sense I swear: weight(%) of each 3 sections, and then the average grade(%) of each 3 sections
    double testPercent;
    double projectPercent;
    double dailyPercent;

    public GradeCalc(double tp, double pp, double dp) {
        testPercent = tp;
        projectPercent = pp;
        dailyPercent = dp;
    }

    public String GradeReport(int tw, int pw, int dw) {
        double testWeight = tw / 100.0;
        double projectWeight = pw / 100.0;
        double dailyWeight = dw / 100.0;
        double grade = Math.round((testPercent*testWeight + projectPercent*projectWeight + dailyPercent*dailyWeight)*100.0) /100.0;
        String letterGrade;
        if (grade >= 95) {
            letterGrade = " (A+)";
        }
        else if (grade >= 90) {
            letterGrade = " (A)";
        }
        else if (grade >= 80) {
            letterGrade = " (B)";
        }
        else if (grade >= 70) {
            letterGrade = " (C)";
        }
        else if (grade >= 60) {
            letterGrade = " (D)";
        }
        else {
            letterGrade = " (F)";
        }
        return "Tests: " +testPercent+ "% || Weight: " +testWeight + "\nProjects: " +projectPercent+ "% || Weight: " +projectWeight + "\nDaily Work: " +dailyPercent+ "% || Weight: " +dailyWeight + "\nOverall grade: " + grade + "%" + letterGrade +"\n";
    }
}
