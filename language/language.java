package language;

import java.util.HashMap;

public class Language {
    
    private String sentenceStructure; 
    private Category currentCategory; 
    private int progressInCategory; 
    private HashMap<Word, Definition> translation; 

  
    public String sentenceStructure()
    { 
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
