package language;
    /**
     * @author gracie
     */
public class Question {
    /**
     * attributes for progress class
     */
    private String question;

    /**
     * getQuestion method
     */
    public String getQuestion() {

        return question;
    }
    /**
     * makeFlashcards method
     * @return question for flashcards
     */
    public String makeFlashCards() {
        return "Question for flashcard" + question;
    }
}
