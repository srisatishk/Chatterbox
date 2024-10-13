package language;
    
import java.util.ArrayList;
/**
 * @author gracie
 */
public class Progress {
     /**
     * attributes for progress class
     */
    private int totalQuestionsAnswered;
    private int numCorrectAnswers;
    private Category currentCategory;
    private int progressInCategory;
    private ArrayList<String> missedWords;

<<<<<<< HEAD
    public int getTotalQuestionsAnswered() {    
        return totalQuestionsAnswered;
    }

    public void setTotalQuestionsAnswered(int totalQuestionsAnswered) {
=======
     /**
     * Progress method
     * constructor for attributes
     */
    public Progress(int totalQuestionsAnswered, int numCorrectAnswers, Category currentCategory, int progressInCategory, ArrayList<String> missedWords) {
>>>>>>> f27a5bd88941f497390d98704441c1d0cd02a838
        this.totalQuestionsAnswered = totalQuestionsAnswered;
        this.numCorrectAnswers = numCorrectAnswers;
        this.currentCategory = currentCategory;
        this.progressInCategory = progressInCategory;
        this.missedWords = new ArrayList<String>();
    }

     /**
     * trackQuestion method
     * tracks the question and related information
     */

    public void trackQuestion() {
        totalQuestionsAnswered++;
        System.out.print("Tracking answers to the questions.");
    }

    /**
     * trackQuestion method
     * tracks the progress of the lesson
     */
    public void trackLesson() {
        progressInCategory++;
        System.out.print("Tracking the progress of the lesson");
    }

    /**
     * trackDaily method
     * tracks the user's daily participation
     */
    public void trackDaily() {

        System.out.print("Tracking the user's daily progress");
    }

    /**
     * trackPercentCorrect method
     * tracks the percentage of correct answers out of the total answers
     */
    public void trackPercentCorrect() {
        if (totalQuestionsAnswered == 0) {
            System.out.print("The user has not answered any questions yet.")
        }
        int perCorrect = (numCorrectAnswers / totalQuestionsAnswered) * 100
        System.out.print("Tracking the percentage of correct answers. : The percentage of correct answers is: " + perCorrect + "%");
    }

    /**
     * trackCorrectAnswer method
     * tracks the amount of questions that have been answered correctly
     */
    public void trackCorrectAnswer() {
        numCorrectAnswers++;
        System.out.print("Tracking the number of correct answers. Total correct answers: " + numCorrectAnswers);
    }

    /**
     * currentCategory method
     * tracks the currentCategory the user is learning
     */
    public Category currentCategory() {
        return currentCategory;
    }

     /**
     * progressInCategory method
     * @return the user's progress in the category
     * 
     */
    public int progressInCategory() {
        return progressInCategory;
    }

     /**
     * getMissedWords method
     * @return the list of missed words
     */
    public ArrayList<String> getMissedWords() {
        return missedWords;
    }

     /**
     * saveProgress method
     * saves the user's progress in the language and category
     */
    public void saveProgress() {
        System.out.println("Saving the user's progress");
    }   
}
