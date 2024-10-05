package language;
    /**
     * @author gracie
     */
public class Question {
    /**
     * attributes for progress class
     */
    private String question;

    // public Question (String question) {
    //     this.question = question;
    // }
    /**
     * getQuestion method
     */
    public String getQuestion() {

        return question;
    }

    public String makeFlashCards() {
        return "Question for flashcard" + question;
    }
}
