package language;

import java.util.ArrayList;

public class FillInTheBlank extends Question{


    // Attributes
  private Phrase sampleSentence;
  private ArrayList<String> wordBank;
  private String userInput;

  public FillInTheBlank(String question, Phrase sampleSentence, ArrayList<String> wordBank) {
      //TODO Auto-generated constructor stub
      super(question);
      this.sampleSentence = sampleSentence;
      this.wordBank = wordBank;
  }

  public String checkAnswer(String userInput) 
  {
    String missingWord = getMissingWord(); 
        if (userInput != null && userInput.equalsIgnoreCase(missingWord)) {
            return "You are correct! The missing word was: " + missingWord;
        } 
        else {
            return "Sorry, that was incorrect. The correct word is: " + missingWord;
        }
  }


    
  public String getMissingWord() 
  {
    String sentence = sampleSentence.getWords();
    String[] words = sentence.split(" ");
    // the first word will always be the missing word
    // example : __ is how you say "yellow" in
    return words[0];
  }

    
  public String getSampleSentence() {
        String sentence = sampleSentence.getWords();
        String missingWord = getMissingWord();
        return sentence.replace(missingWord, "___"); 
  }
 
}
