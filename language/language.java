package language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Language {
    private UUID languageID;
    private String sentenceStructure; 
    private Category currentCategory; 
    private int progressInCategory; 
    private static ArrayList<Word> translation; 

    public Language(UUID languageID, String sentenceStructure, String currentCategory, int progressInCategory) {
        this.sentenceStructure = sentenceStructure;
        this.currentCategory = currentCategory;
        this.progressInCategory = progressInCategory; 
        this.translation = new ArrayList<>();
    }

    public UUID getLanguageID() {
        return languageID;
    }
    
    public String getSentenceStructure() { 
        
        return sentenceStructure; 
    }
    public void progressInLanguage()
    { 
        return; 
    }
    public void trackCategory()
    { 
        return; 
    }
    public HashMap<Word, Definition> getTranslation()
    {
        return null; 
    }

}
