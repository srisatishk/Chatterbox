package language;

import java.util.List;

/**
     * @author gracie
     */
public class Question {
    /**
     * attributes for progress class
     */
    protected String question;

    public Question(String string, String string2, List<String> list){  
    }

    public Question(String question) {
        this.question = question;
    }

    /**
     * getQuestion method
     */
    public String getQuestion() {

        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * makeFlashcards method
     * @return question for flashcards
     */
    public String makeFlashCards() {
        return "Question for flashcard" + question;
    }

    
}
