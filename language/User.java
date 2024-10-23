package language;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author sri
 */
public class User{
/**
 * attributes for user class
 */
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String username;
    private String password;
    private HashMap<Language,Progress> languages;

    /*
     * User constructor
     */
    public User(UUID id, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String username, String password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        this.languages = new HashMap <>();
    }

    public User(UUID id, String firstName, String lastName, String email, String username, LocalDate dateOfBirth, String password) {
        this(id, firstName, lastName, email, "", dateOfBirth, username, password);
    }

    /**
     * Getter for user ID
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Getter for user firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for user lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for user email
     * @return email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Setter for email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Getter for user username
     * @return username
     */
    public String getUsername(){
        return username;
    }

    /**
     * Setter for username
     */
    public void setUsername(String username){
        this.username = username;
    }

    public String getEnterUsername(){
        return username;
    }

    public void setEnterUsername(String username){
        this.username = username;
    }

    /**
     * Getter for user password
     * @return password
     */
    public String getPassword(){
        return password;
    }

    /**
     * Setter for password
     */
    public void setPassword(String password){
        this.password = password;
    }

    public String getEnterPassword() {
        return password;
    }

    public void setEnterPassword(String username){
        this.username = username;
    }

    /**
     * Getter for user phoneNumber
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        if (phoneNumber != null && phoneNumber.length() == 10) {
            return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
        }
        return phoneNumber;
    }

    /**
     * Setter for phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for user dateOfBirth
     * @return dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for dateOfBirth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for formatted user dateOfBirth
     * @return dateOfBirth.format(formatter)
     */
    public String getFormattedDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return dateOfBirth.format(formatter);
    }

    /**
     * Getter for user languages HashMap
     * @return languages
     */
    public HashMap<Language, Progress> getLanguages(){
        return languages;
    }

    /**
     * Setter for languages
     */
    public void setLanguages(HashMap<Language, Progress> langugages) {
        this.languages = languages;
    }

    /**
     * Sets perameters for making a new password
     */
    public void forgotPassword(String newPassword){
        String defaultPassword = "LanguageLearner123@";
        if (newPassword.length() <= 8 || newPassword.length() > 20 || !newPassword.matches(".*[!@#$%^&*()].*")) {
            System.out.print("Password must be 8-20 characters and contain at least one special character. Now setting the default password.");
            this.password = defaultPassword;
        } else {
            this.password = newPassword;
        }
    }
}


