
/**
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class View {
    // Text's constants
    public static final String GREETING = "Welcome to the Guessing Number Game!";
    public static final String RULES = "The rule is that you need to guess the number that I had in mind.\n" +
            "It ranges between 0 (inclusive) and 100 (exclusive).";
    public static final String INPUT_INT_GUESS = "Input your guess, that represents integer number = ";
    public static final String WRONG_INPUT_INT_GUESS_RANGE = "Nope. Range is between ";
    public static final String WRONG_INPUT_INT = "Wrong input! Must be an integer number!";
    public static final String WIN = "Congratulations! You won!";
    public static final String NUMBER_OF_TRIES = "Number of tries = ";
    public static final String NUMBER_TO_GUESS = "Number to guess = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

    public void printMessageAndRange(String message, int lowerBound, int upperBound) {
        System.out.println(message + lowerBound + "(inclusive) and " + upperBound + "(inclusive)!");
    }

}
