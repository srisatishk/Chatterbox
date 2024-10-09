package language;

import java.util.HashMap;

/* sentence structure and progress in the class
 * @author grace 
 */

public class Language {

    private String sentenceStructure; 
    private String currentCategory; 
    private int progressInCategory; 
    private HashMap<Word, definition> translation; 

    public Language(String sentenceStructure, String currentCategory, int progressInCategory) {
        this.sentenceStructure = sentenceStructure;
        this.currentCategory = currentCategory;
        this.progressInCategory = progressInCategory; 
        this.translation = new HashMap<>();
    }
  
    public String getSentenceStructure() { 
        return sentenceStructure; 
    }

    public int getProgressInCategory() { 
        return progressInCategory; 
    }

    public String getCurrentCategory() { 
        return currentCategory; 
    }

    public HashMap<word, definition> getTranslation() {
        return translation; 
    }

    public void addTranslation(String word, String definition) {
        translation.put(word, definition);
    }

    public void progressInLanguage(int progress) { 
        this.progressInCategory += progress; 
    }

    public void trackCategory(String newCategory) { 
        this.currentCategory = newCategory; 
    }
}
