public class GradeCalc {
    //A bit long, but makes sense I swear: weight(%) of each 3 sections, and then the average grade(%) of each 3 sections
    int testWeight;
    int projectWeight;
    int dailyWeight;
    boolean testPercent;
    boolean projectPercent;
    boolean dailyPercent;

    public GradeCalc(boolean tp, boolean pp, boolean dp) {
        testPercent = tp;
        projectPercent = pp;
        dailyPercent = dp;
    }

    public String Grade(int tw, int pw, int dw) {
        testWeight = tw;
        projectWeight = pw;
        dailyWeight = dw;

    }
}
