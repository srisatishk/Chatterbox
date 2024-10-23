package language;

import java.util.ArrayList;
/**
 * @author zaniah and grace 
 */
public class Word {
    /**
     * attributes for word class
     */
    private String word;
    private String pronunciation;
    private String translation;
    private ArrayList<String> alternatives; 

    public Word(String word, String pronunciation, String translation) {
       this.word = word;
       this.pronunciation = pronunciation;
       this.translation = translation;
        this.alternatives = new ArrayList<>();
    }

    
    /**
     * getword method
     * @return the letters in the word
     */
    public String getword(){
        return word;
    }

    /**
     * getPronunciation method
     * @return pronunciation of the word
     */
    public String getPronunciation(){

        return pronunciation;
    }

    /**
     * getTranslation method
     * @return translation of the word
     */
    public String getTranslation(){
        return translation;
    }

    public ArrayList<String> getAlternatives() {
        return new ArrayList<>(alternatives); 
    }
}
