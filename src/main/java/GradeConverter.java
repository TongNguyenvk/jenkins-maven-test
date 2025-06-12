/**
 * Class to convert numerical score to letter grade.
 */
public class GradeConverter {

    // Constants to avoid magic numbers
    private static final int MAX_SCORE = 100;
    private static final int MIN_SCORE = 0;
    private static final int A_MIN = 90;
    private static final int B_MIN = 80;
    private static final int C_MIN = 70;
    private static final int D_MIN = 60;

    /**
     * Converts a score to a letter grade.
     *
     * @param score the numerical score to convert
     * @return the corresponding letter grade
     */
    public String convert(final int score) {
    if (score > MAX_SCORE || score < MIN_SCORE) {
        return "Invalid";
    }

    if (score >= A_MIN) {
        return "A";
    } else if (score >= B_MIN) {
        return "B";
    } else if (score >= C_MIN) {
        return "C";
    } else if (score >= D_MIN) {
        return "D";
    } else {
        return "E";
    }
}

}
