
/**
 * Class to convert numerical score to letter grade.
 */
public class GradeConverter {

    /** Maximum score allowed. */
    private static final int MAX_SCORE = 100;

    /** Minimum score allowed. */
    private static final int MIN_SCORE = 0;

    /** Minimum score for grade A. */
    private static final int A_MIN = 90;

    /** Minimum score for grade B. */
    private static final int B_MIN = 80;

    /** Minimum score for grade C. */
    private static final int C_MIN = 70;

    /** Minimum score for grade D. */
    private static final int D_MIN = 60;

    /**
     * Converts a score to a letter grade.
     *
     * @param score the numerical score to convert
     * @return the corresponding letter grade, or "Invalid" if score is out of range
     */
    public String convert(final int score) {
        if (score >= A_MIN && score <= MAX_SCORE) {
            return "A";
        } else if (score >= B_MIN) {
            return "B";
        } else if (score >= C_MIN) {
            return "C";
        } else if (score >= D_MIN) {
            return "D";
        } else if (score >= MIN_SCORE) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
