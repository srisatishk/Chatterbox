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
    private int streak;

    public User(UUID id, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String username, String password, int streak){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        this.languages = new HashMap <>();
        this.streak = streak; 
    }

    public User(UUID id, String firstName, String lastName, String email, String username, LocalDate dateOfBirth, String password, int streak) {
        this(id, firstName, lastName, email, "", dateOfBirth, username, password, streak);
        // this.id = UUID.randomUUID();
        // this.firstName = firstName;
        // this.lastName = lastName;
        // this.email = email;
        // this.phoneNumber = phoneNumber;
        // this.dateOfBirth = dateOfBirth != null ? dateOfBirth :LocalDate.of(2000, 1, 1);
        // this.username = username;
        // this.password = password;
        // //this.languages = new HashMap<>();
        // this.streak = 0;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEnterUsername(){
        return username;
    }

    public void setEnterUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEnterPassword() {
        return password;
    }

    public void setEnterPassword(String username){
        this.username = username;
    }

    public String getPhoneNumber(){
        if (phoneNumber != null && phoneNumber.length() == 10) {
            return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFormattedDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return dateOfBirth.format(formatter);
    }

    // public static LocalDate parseDateOfBirth(String dobString) {
    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    //     try {
    //         return LocalDate.parse(dobString, formatter);
    //     } catch (DateTimeParseException e) {
    //         System.out.println("Invalid date format: " + dobString + ". Using default date.");
    //         return LocalDate.of(2000, 1, 1); // Default date if parsing fails
    //     }
    // }
    // private LocalDate calculateDateOfBirth(int year, int month, int day) {
    //     if (year >= 1900 && year <= LocalDate.now().getYear() && month >= 1 && month <= 12) {
    //         boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    //         int maxDays = (month == 2 && isLeapYear) ? 29 : (month == 2) ? 28 : (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    //         if (day >= 1 && day <= maxDays) {
    //             return LocalDate.of(year, month, day);
    //         }
    //     }
    //     return LocalDate.of(2000, 1, 1); 
    // }

    public int getStreak(){
        return streak;
    }

    public HashMap<Language, Progress> getLanguages(){
        return languages;
    }

    public void setLanguages(HashMap<Language, Progress> langugages) {
        this.languages = languages;
    }

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


