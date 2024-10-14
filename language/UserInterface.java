package language;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale.Category;
import java.util.Scanner;
import java.util.UUID;

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
        //this.dataWriter = new DataWriter();



    }

    public boolean login(String username, String password) {
        // System.out.print("Login for user: " + username);
        //     return true;

        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successful for: " + username);
                return true;
            }
        }
        System.out.println("Incorrect username or password!");
        return false;

    }

    public void createAccount(String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String username, String password) {
        System.out.println("Account creation.");
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter your first name: ");
        // String firstName = scanner.nextLine();
        
        // System.out.print("Enter your last name: ");
        // String lastName = scanner.nextLine();
        
        // System.out.print("Enter your email: ");
        // String email = scanner.nextLine();
        
        // System.out.print("Enter a username: ");
        // String username = scanner.nextLine();
        
        // System.out.print("Enter a password: ");
        // String password = scanner.nextLine();

        User newUser = new User(UUID.randomUUID(), firstName, lastName, email, phoneNumber, dateOfBirth, username, password, 0);
        userList.add(newUser);
        System.out.println("Account has been successfully created for: " + username);
        DataWriter.writeUsers(userList); 

    }

    // Scenario 1: simple login
    public void scenario1() {
        System.out.println("Scenario 1");

        // Hardcoded username and password for login
        String username = "janesmith10";
        String password = "IlovemyCat";

        if (login(username, password)) {
            System.out.println("Welcome, " + currentUser.getFirstName() + " " + currentUser.getLastName() + "!");
        }
    }

    // Scenario 2: create account
    public void scenario2() {
        System.out.println("Scenario 2");

        String firstName = "John";
        String lastName = "Doe";
        String email = "johndoe@gmail.com";
        String phoneNumber = "627-917-2739";
        LocalDate dateOfBirth = LocalDate.of(2005, 1, 1); 
        String username = "johndoe73";
        String password = "IlovemyCat";

        createAccount(firstName, lastName, email, phoneNumber, dateOfBirth, username, password);

        // After creating the account, try to log in with the new account
        if (login(username, password)) {
            System.out.println("Welcome, " + currentUser.getFirstName() + " " + currentUser.getLastName() + "!");
        }
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

     // Main method to test the scenarios
     public static void main(String[] args) {
        UserInterface langUI = new UserInterface();

        langUI.userList.add(new User(UUID.randomUUID(), "Jane", "Smith", "jsmith@gmail.com", "817-902-3201", LocalDate.of(1998, 10, 7), "janesmith10", "IlovemyCat", 0));
        langUI.userList.add(new User(UUID.randomUUID(), "John", "Doe", "johndoe@gmail.com", "627-917-2739", LocalDate.of(2005, 1, 1), "johndoe73", "IlovemyCat", 0));

        // run scenarios
        langUI.scenario1(); // login scenario
        langUI.scenario2(); // create account
    }
}