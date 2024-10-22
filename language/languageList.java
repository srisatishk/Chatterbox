package language;

import java.util.ArrayList;
import java.util.UUID;

/** @author grace 
 * 
**/

public class LanguageList {

   // private LanguageList languagelist; 
   private UUID userID;
    private String language; 
    private ArrayList<Category> categories; 
    private ArrayList<Word> wordList; 
    private ArrayList<String> languages; 
    private ArrayList<Phrase> phraseList; 
    private static LanguageList languageList; 

    //load content from json
    private LanguageList()
    { 
       this.categories = new ArrayList<>(); 
       this.wordList =new ArrayList<>(); 
       this.languages = new ArrayList<>(); 
       this.phraseList = new ArrayList<>(); 
    }

    

    public static LanguageList getInstance()
    { 
        if (languageList == null)
        { 
            languageList = new LanguageList();
        }
        return languageList;
    }

    public String toString()
    { 
        return "Current Language: " + language + "\nAvailable Languages: " + languages + 
               "\nCategories: " + categories + "\nWords: " + wordList + 
               "\nPhrases: " + phraseList; 
    }
    public void listLanguages()
    { 
        System.out.println("The available languages are" + languages); 
    }
    public ArrayList<String> chooseLanguage () 
    { 
        return new ArrayList<>(languages); 
    }
    public void listCategories()
    { 
        System.out.println("The available languages are" + categories); 
    }
    public ArrayList<Category> chooseCatergory() 
    { 
        return new ArrayList<>(categories); 
    }
    public ArrayList<String> getLanguage () 
    { 
        return new ArrayList<>(languages);
    }
    public ArrayList<Word> getwordlist () 
    { 
        return new ArrayList<>(wordList);
    }
    public ArrayList<Phrase> getphraselist () 
    { 
        return new ArrayList<>(phraseList);
    }
    
    

    public UUID getuserID()
    { 
        return getuserID();
    }

}
