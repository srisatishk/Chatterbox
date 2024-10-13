package language;

import java.util.ArrayList;

public class Progress {

    private int totalQuestionsAnswered;
    private int numCorrectAnswers;
    private Category currentCategory;
    private int progressInCategory;
    private ArrayList<String> missedWords;

    public int getTotalQuestionsAnswered() {    
        return totalQuestionsAnswered;
    }

    public void setTotalQuestionsAnswered(int totalQuestionsAnswered) {
        this.totalQuestionsAnswered = totalQuestionsAnswered;
    }

    public int getNumCorrectAnswers() {
        return numCorrectAnswers;
    }

    public void setNumCorrectAnswers(int numCorrectAnswers) {
        this.numCorrectAnswers = numCorrectAnswers;
    }

    public Category getCurrentCategory() {
        return currentCategory;
    }

    public void setCurrentCategory(Category currentCategory) {
        this.currentCategory = currentCategory;
    }

    public int getProgressInCategory() {
        return progressInCategory;
    }

    public void setProgressInCategory(int progressInCategory) {
        this.progressInCategory = progressInCategory;
    }

    public ArrayList<String> getMissedWords() {
        return missedWords;
    }

    public void setMissedWords(ArrayList<String> missedWords) {
        this.missedWords = missedWords;
    }

    public void trackQuestion() {

    }

    public void trackLesson() {

    }

    public void trackDaily() {

    }

    public void trackPercentCorrect() {

    }

    public void trackCorrectAnswer() {

    }

   

    public void saveProgress() {

    }
}

