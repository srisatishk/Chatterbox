package language;

import java.util.ArrayList;
import java.util.HashMap;

/**
     * @author grace
    */
public class WordList {
    
    private String category;
    private ArrayList<Word> words;
    private HashMap<String, ArrayList<Word>> hashmap;


    public WordList()
    { 
        words = DataLoader.getWords(); 
        category = DataLoader.getCategory();
        hashmap = new HashMap<>();
       
        hashmap.put(category, words); 
    }


    //hashmap category to arraylistwords 


}
