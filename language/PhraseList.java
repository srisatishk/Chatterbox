package language;

import java.util.ArrayList;
import java.util.HashMap;

/**
     * @author grace
    */
public class PhraseList {
    
    private String category;
    private ArrayList<Phrase> phrases;
    private HashMap<String, ArrayList<Phrase>> hashmap;


    public PhraseList()
    { 
        phrases = DataLoader.getPhrases(); 
        category = DataLoader.getCategory();
        hashmap = new HashMap<>();
       
        hashmap.put(category, phrases); 
    }


    //hashmap category to arraylistwords 


}
