package language;

import java.util.ArrayList;
import java.util.HashMap;

/**
     * @author grace
    */
public class PhraseList {
    
    private Category category;
    private ArrayList<Phrase> phrases;
    HashMap<Category, ArrayList<Phrase>> hashMap = new HashMap<>();


    public PhraseList()
    { 
        phrases = DataLoader.getPhrases(); 
        category = DataLoader.getCategory();
        hashMap = new HashMap<>();
        hashMap.put(category, phrases); 
    }


    //hashmap category to arraylistwords 


}
