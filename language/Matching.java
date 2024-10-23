package language;
/* @author grace */
import java.util.ArrayList;
import java.util.List;

public class Matching extends Question{

    public Matching(String question) {
        super(question);
        //TODO Auto-generated constructor stub
            }

    private ArrayList<String> imageList;
    private ArrayList<String> wordList;  
    

    public ArrayList<String> getImageList(){
        return this.imageList;
    }

    public ArrayList<String> getWordList()
    {
       return this.wordList; 

    }

    public void setImageList(ArrayList<String> imageList) 
    {
        // check to avoid null-pointer exception
        if(imageList != null){
        this.imageList = imageList;
        }
    }

    public void setWordList(ArrayList<String> wordList)
    {
        if(wordList != null)
        this.wordList = wordList;
    }
} 

