package grade;
/**
 * Class to convert numerical scores into corresponding letter grades.
 * <p>
 * The grading scale is as follows:
 * <ul>
 *     <li>90–100: A</li>
 *     <li>80–89: B</li>
 *     <li>70–79: C</li>
 *     <li>60–69: D</li>
 *     <li>0–59:  E</li>
 *     <li>Any score outside 0–100: Invalid</li>
 * </ul>
 */
public class GradeConverter {

    /** Maximum valid score. */
    private static final int MAX_SCORE = 100;

    /** Minimum valid score. */
    private static final int MIN_SCORE = 0;

    /** Minimum score to receive an A grade. */
    private static final int A_MIN = 90;

    /** Minimum score to receive a B grade. */
    private static final int B_MIN = 80;

    /** Minimum score to receive a C grade. */
    private static final int C_MIN = 70;

    /** Minimum score to receive a D grade. */
    private static final int D_MIN = 60;

    /**
     * Converts a numerical score to a letter grade based on a predefined scale.
     *
     * @param score the numerical score to convert (expected between 0 and 100)
     * @return the corresponding letter grade ("A" to "E"), or
     * "Invalid" if score is out of bounds
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
