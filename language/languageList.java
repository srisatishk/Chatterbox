package language;

import java.util.ArrayList;

/** @author grace 
 * 
**/

public class LanguageList {

   // private LanguageList languagelist; 
    private String language; 
    private ArrayList<Category> categories; 
    private ArrayList<Word> wordlist; 
    private ArrayList<String> languages; 
    private ArrayList<Phrase> phraselist; 

  
    public void LanguageList()
    { 
       this.categories = new ArrayList<>(); 
       this.wordlist =new ArrayList<>(); 
       this.languages = new ArrayList<>(); 
       this.phraselist = new ArrayList<>(); 
    }
    public String toString()
    { 
        return language; 
    }
    public void listLanguages()
    { 
        return; 
    }
    public ArrayList<String> chooseLanguage () 
    { 
        return languages; 
    }
    public ArrayList<String> getLanguage () 
    { 
        return languages; 
    }

}
