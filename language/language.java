package language;

import java.util.ArrayList;
import java.util.HashMap;

public class Language {
    
    private String sentenceStructure; 
    private Category currentCategory; 
    private int progressInCategory; 
<<<<<<< HEAD
    private static ArrayList<Word> translation; 

    public Language(String sentenceStructure, String currentCategory, int progressInCategory) {
        this.sentenceStructure = sentenceStructure;
        this.currentCategory = currentCategory;
        this.progressInCategory = progressInCategory; 
        this.translation = new ArrayList<>();
    }
  
    public String getSentenceStructure() { 
        
=======
    private HashMap<Word, Definition> translation; 

  
    public String sentenceStructure()
    { 
>>>>>>> 8bfe4bbed17606a0c4e85a154910c103e56c8053
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
