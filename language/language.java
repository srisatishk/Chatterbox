package language;

import java.util.ArrayList;
import java.util.UUID;

public class language {
    private UUID languageID;
    private ArrayList<Category> categories;
    private language language;

    public language(UUID languageID) {
        this.languageID = UUID.randomUUID();
        this.categories = new ArrayList<>();
    }
    //language ID is a random UUID
    public UUID getLanguageID() 
    {
        return languageID;
    }
    public ArrayList<Category> getCatergories() 
    {
        return new ArrayList<>(categories);
        
    }
    public language getLanguage() {
        return language;
    }


}
