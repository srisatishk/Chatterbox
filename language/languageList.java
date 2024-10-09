package language;

import java.util.ArrayList;
import java.util.List;

/* @author grace */
public class LanguageList {

    private String language; 
    private ArrayList<Category> categories; 
    private ArrayList<Word> wordList; 
    private ArrayList<String> languages; 
    private ArrayList<Phrase> phraseList; 

    public LanguageList() {
        this.languages = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.wordList = new ArrayList<>();
        this.phraseList = new ArrayList<>();
    }

    public String toString() { 
        return language; 
    }


    public void listLanguages(ArrayList<String> languages) { 
        this.languages.addAll(languages);
    }

    public ArrayList<String> chooseLanguage() { 
        return languages; 
    }

    public ArrayList<String> getLanguages() { 
        return languages; 
    }
    public ArrayList<Category> chooseCategories() { 
        return categories; 
    }


}
