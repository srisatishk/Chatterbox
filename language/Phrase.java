package language;
import java.util.ArrayList;
/**
 * @author zaniah and grace 
 */
public class Phrase {
    /**
     * attributes for phrase class
     */
    private ArrayList<Word> words;
    private String translation;

   public Phrase(String translation) {
    this.words = new ArrayList<>();  // Initialize the words list
    this.translation = translation;
}

    /**
     * getWords method
     * @return the words that will be in the phrase
     */
    public ArrayList<Word> getWords(){
        //return "words";
        return words;
    }

    /**
     * getTranslation method
     * @return the translation of the phrase in diff language
     */
    public String getTranslation(){
        //return "translation";
        return translation;
    }
}
