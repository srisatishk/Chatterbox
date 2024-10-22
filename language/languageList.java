package language;

import java.util.ArrayList;

/** @author grace 
 * 
**/

public class LanguageList {

   // private LanguageList languagelist; 
    private String language; 
    private ArrayList<Category> categories; 
    private ArrayList<Word> wordList; 
    private ArrayList<String> languages; 
    private ArrayList<Phrase> phraseList; 

  
    public LanguageList()
    { 
       this.categories = new ArrayList<>(); 
       this.wordList =new ArrayList<>(); 
       this.languages = new ArrayList<>(); 
       this.phraseList = new ArrayList<>(); 
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

}
