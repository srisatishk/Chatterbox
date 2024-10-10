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

    public String getLastName() {
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        if (phoneNumber != null && phoneNumber.length() == 10) {
            return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6);
        }
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth (int year, int month, int day) {
        if (year >= 1900 && year <= 2024 && month >= 1 && month <= 12) {
            boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            if (month == 2 ) {
                if (day >= 1 && day <= 29 && isLeapYear) {
                    this.dateOfBirth = LocalDate.of(year, month, day);
                }
                else if (day >= 1 && day <= 28 && !isLeapYear) {
                    this.dateOfBirth = LocalDate.of(year, month, day);
                }
                else {
                    this.dateOfBirth = LocalDate.of(2000, 1, 1);
                }
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                if (day >= 1 && day <= 30) {
                    this.dateOfBirth = LocalDate.of(year, month, day);
                }
                else {
                    this.dateOfBirth = LocalDate.of(2000, 1, 1);
                }
            }
            else {
                if (day >= 1 && day <= 30) {
                    this.dateOfBirth = LocalDate.of(year, month, day);
                }
                else {
                    this.dateOfBirth = LocalDate.of(2000, 1, 1);
                }
            }
            
        }
        else {
            this.dateOfBirth = LocalDate.of(2000, 1, 1);
        }
    }

    public String getEnterUsername(){
        return username;
    }

    public String getEnterPassword(){
        return password;
    }

    public void forgotPassword(String newPassword){
        String defaultPassword = "LanguageLearner123@";
        if (newPassword.length() >= 8 && newPassword.length() <= 20){
            System.out.print("Password must be at least 8 to 20 characters long. Now setting to the default password.");
            this.password = defaultPassword;
            return;
        }
        if (!newPassword.matches(".*[!@#$%^&()].*")) {
            System.out.print("Password must contain at least one special character. Now setting to the default password.");
            this.password = defaultPassword;
            return;
        }
        this.password = newPassword;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public int getStreak(){
        return streak;
    }

    public boolean getLogout(){
        return true;
    }

    public HashMap<language, Progress> getLanguages(){
        return languages;
    }

}

