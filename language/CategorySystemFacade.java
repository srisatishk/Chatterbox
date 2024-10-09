package language;

import java.util.List;
/**
 * @author zaniah
 */
public class CategorySystemFacade {
    /**
     * attributes for the facade
     */
    private User user;
    private Category category;
    private Question question;
    private Phrase phrases;
    private Word words;
    private Language language;
    private Progress progress;

    /**
     * constructor 
     * @param user the user 
     * @param category option for the user to choose how they want to study
     * @param question the question that will be asked to the user when studying
     * @param phrases gives the user option to study phrases in diff language
     * @param words gives the user option to study words in diff language
     * @param language the language the user is studying
     * @param progress how far along the user is in their studies/how active they are
     */
    public CategorySystemFacade(User user, Category category, Question question, Phrase phrases, 
    Word words, Language language, Progress progress){

        this.user = user;
        this.category = category;
        this.question = question;
        this.phrases = phrases;
        this.words = words;
        this.language = language;
        this.progress = progress;
    }

    /**
     * addUser method
     * add user to the system
     * @return true or false if they were successfully added
     */
    public boolean addUser(){
        return true;
    }

    /**
     * login method
     * user can login if they already have an account
     * @return true or false if login is successful
     */
    public boolean login(){
        return true;
    }

    /**
     * getCategory method 
     * list of categories for the user to choose from
     * @return the category that the user chose
     */
    public List<String> getCategory(){
        return null;
    }

    /**
     * getProgress method
     * @return the user progress
     */
    public Progress getProgress(){
        return null;
    }

    /**
     * getLanguage method
     * @return the language the user wants to study
     */
    public Language getLanguage(){
        return null;
    }

    /**
     * getPhrase method
     * list of phrases for the user to learn/study
     * @return phrase for the user to learn in diff language
     */
    public List<Phrase> getPhraseList(){
        return null;
    }

    /**
     * getWord method
     * a list of words for the user to learn/study
     * @return
     */
    public List<Word> getWordList(){
        return null;
    }

    /**
     * getLanguage method
     * @return languages
     */
    public List<Language> getLanguageList(){
        return null;
    }

    /**
     * getQuestion method
     * string representation of questions that could be 
     * asked to user to help vthem learn/study
     * @return a question for the user
     */
    public String getQuestion(){
        return null;
    }

    /**
     * MockConvo method
     * a way for the user to study by having mock conversations
     */
    public void getMockConversation(){

    }

    /**
     * getFillBlank method
     * a way for the user to study by answering fill in the blank questions
     */
    public void getFillintheBlank(){

    }

    /**
     * getFlashcard method
     * a way for the user to study with flashcards
     */
    public void getFlashcards(){

    }

    /**
     * getMatch method
     * a way for the user to study by matching words with an image
     */
    public void getMatching(){
        
    }
}
