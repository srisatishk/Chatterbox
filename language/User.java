package language;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.UUID;
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
    private HashMap<language, Progress> languages;
    private int streak;

    public User(String firstName, String lastName, String email){
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.languages = new HashMap<>();
        this.streak = 0; 
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

    public void setDateOfBirth(int year, int month, int day) {
        // Date of Birth logic, same as your original
        this.dateOfBirth = calculateDateOfBirth(year, month, day);
    }

    private LocalDate calculateDateOfBirth(int year, int month, int day) {
        // Ensure valid leap year, month, and day calculations
        if (year >= 1900 && year <= LocalDate.now().getYear() && month >= 1 && month <= 12) {
            boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            int maxDays = (month == 2 && isLeapYear) ? 29 : (month == 2) ? 28 : (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
            if (day >= 1 && day <= maxDays) {
                return LocalDate.of(year, month, day);
            }
        }
        return LocalDate.of(2000, 1, 1);  // Default value
    }

    public int getStreak(){
        return streak;
    }

    public HashMap<language, Progress> getLanguages(){
        return languages;
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


