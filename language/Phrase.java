package language;
import java.util.ArrayList;
/**
 * @author zaniah
 */
public class Phrase extends Question {
    /**
     * attributes for phrase class
     */
    private ArrayList<Word> words;
    private ArrayList<String> translation;
   // private boolean structure;

    /**
     * getWords method
     * @return the words that will be in the phrase
     */
    public String getWords(){
        //return "words";
        return null;
    }

    /**
     * getPronunciation method
     * @return the pronunciation for the pharse
     */
    public String getPronunciation(){
        //return "pronunciation";
        return null;
    }

    /**
     * getTranslation method
     * @return the translation of the phrase in diff language
     */
    public String getTranslation(){
        //return "translation";
        return null;
    }

    /**
     * hasStructure method
     * @return true or false if the phrase has structure ??
     */
    public boolean hasStructure(){
        return true;
    }
}
