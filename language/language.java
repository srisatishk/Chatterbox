package language;

import java.util.ArrayList;
import java.util.UUID;

public class Language {
    private UUID languageID;
    private Category currentCategory; 
    private int progressInCategory; 
    private ArrayList<Word> translations;

    public Language(UUID languageID, String currentCategory, int progressInCategory) {
        this.languageID = UUID.randomUUID();
        this.currentCategory = currentCategory;
        this.progressInCategory = progressInCategory; 
        this.translations = new ArrayList<>();
    }
    //language ID is a random UUID
    public UUID getLanguageID() 
    {
        return languageID;
    }
    //the progress in the category keeps going up//
    public void progressInLanguage()
    { 
       progressInCategory++; 
    }
    //printing your category
    public void currentCategory()
    {  
        System.out.println("Current Category is: " + currentCategory); 
    }
    public ArrayList<Word> getTranslations() 
    {
        return new ArrayList<>(translations);
        // Return the list of translations
        
    }
    public void getTranslation(Word, translation)
    {
        //how would i do this? 
        //all the translations are in the json file 
    }


}
