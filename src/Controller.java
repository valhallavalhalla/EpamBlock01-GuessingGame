
import java.util.Scanner;

/**
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        int lowerBound = 0;
        int upperBound = 100;
        boolean isGuessed = false;

        model.setNumberToGuess(Model.rand(lowerBound, upperBound));
        model.setLowerBound(lowerBound);
        model.setUpperBound(upperBound);

        view.printMessage(View.GREETING);
        view.printMessage(View.RULES);
        while (!isGuessed) {
            isGuessed = model.makeGuess(inputIntValueWithScanner(sc));
            if (isGuessed) {
                view.printMessage(View.WIN);
                view.printMessageAndInt(View.NUMBER_OF_TRIES, model.getNumberOfTries());
                view.printMessageAndInt(View.NUMBER_TO_GUESS, model.getNumberToGuess());
            } else {
                view.printMessageAndRange(View.WRONG_INPUT_INT_GUESS_RANGE,
                        model.getLowerBound(), model.getUpperBound());
            }

        }
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_GUESS);
        while( !sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT);
            view.printMessage(View.INPUT_INT_GUESS);
            sc.next();
        }
        return sc.nextInt();
    }
}
