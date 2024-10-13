package language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale.Category;
import java.util.Scanner;

public class UserInterface {

private String sentenceStructure;
    private Category currentCategory;
    private int progressInLanguage;
    private HashMap<Word, String> translation;
    private ArrayList<Category> categories;
    private ArrayList<String> languages;
    private ArrayList<Word> wordList;
    private ArrayList<Phrase> phraseList;
    private int languageID;
    private User currentUser;
    private ArrayList<User> userList; 

    public UserInterface() {
        this.languages = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.userList = new ArrayList<>();


    }

    public boolean login(String username, String password) {
        System.out.print("Login for user: " + username);
            return true;

    }

    public void createAccount() {
        System.out.println("Account creation.");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
    }

    public void chooseLanguage() {
        System.out.print("List of languages: ");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println((i + 1) + ". " + languages.get(i));
        }
        System.out.print("Choose a language (enter number): ");
        Scanner scanner = new Scanner(System.in);
        int languageChoice = scanner.nextInt();
        
        if (languageChoice > 0 && languageChoice <= languages.size()) {
            System.out.println("You have selected: " + languages.get(languageChoice - 1));
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
    

    public void chooseCategory() {
       System.out.print(" List of categories in language: ");
    }

    public void progressInLanguage() {
        System.out.print("Track the progress in the language.");
    }

}
