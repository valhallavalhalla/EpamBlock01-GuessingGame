import java.util.Random;

/**
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class Model {

    // Random number generator
    private static final Random random = new Random();

    // Default upper bound of generated number value
    private static final int RAND_MAX = Integer.MAX_VALUE;

    // Bounds
    private int lowerBound = 0;
    private int upperBound = 0;

    // Random number
    private int numberToGuess = 0;

    // Count of tries
    private int numberOfTries = 0;

    // The Program logic

    /**
     * Compare {@code userGuess} to {@code numberToGuess}.
     * If they equals, then return true.
     * And increment the {@code numberOfTries}.
     *
     * If {@code userGuess} less than {@code numberToGuess} and
     * greater or equal to {@code lowerBound}, then assign
     * {@code userGuess} to {@code lowerBound} and
     * return false.
     *
     * If {@code userGuess} greater than {@code numberToGuess} and
     * less or equal to {@code upperBound}, then assign
     * {@code userGuess} to {@code upperBound} and
     * return false.
     *
     * Else, return false.
     *
     * @param userGuess the number that user guess
     * @return true, if {@code userGuess} equal to {@code numberToGuess}
     *         anything else - return false
     */
    public boolean makeGuess(int userGuess) {
        numberOfTries++;
        if (userGuess == numberToGuess){
            return true;
        } else if (userGuess < numberToGuess && userGuess >= lowerBound) {
            lowerBound = userGuess;
            return false;
        } else if (userGuess > numberToGuess && userGuess <= upperBound) {
            upperBound = userGuess;
            return false;
        } else {
            return false;
        }
    }

    /**
     * Generate a pseudorandom {@code int} value
     * between 0 (inclusive) and {@value RAND_MAX} (inclusive).
     *
     * @return the generated pseoudorandom value
     */
    public static int rand() {
        return random.nextInt(RAND_MAX);
    }

    /**
     * Generate a pseudorandom {@code int} value
     * between {@code min} (inclusive) and {@code max} (inclusive).
     *
     * @param min the lower bound (inclusive).
     *            Must be positive and less than {@code max}
     * @param max the upper bound (inclusive).
     *            Must be positive and greater than {@code min}
     * @return the pseudorandom, {@code int} value
     *         between {@code min} (inclusive) and {@code max} (inclusive)
     *
     */
    public static int rand(int min, int max) {
        return (random.nextInt(max - min + 1) + min);
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

}
