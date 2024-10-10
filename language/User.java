package language;
import java.util.HashMap;
import java.util.Date;
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
    private Date dateOfBirth;
    private String username;
    private String password;
    private HashMap<Language, Progress> languages;
    private int streak;

    public User(String firstName, String lastName, String email){
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.languages = new HashMap<>();
        this.streak = 0; 
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getDayofBirth(){
        return 0;
    }

    public void setDayofBirth(){

    }

    public int getMonthofBirth(){
        return 0;
    }

    public void setMonthofBirth(){

    }

    public int getYearofBirth(){
        return 0;
    }

    public void setYearofBirth(){

    }

    public String getEnterUsername(){
        return username;
    }

    public void setEnterUsername(String username){
        this.username = username;
    }

    public String getEnterPassword(){
        return password;
    }

    public void setEnterPassword(String password){
        this.password = password;
    }

    public void forgotPassword(String newPassword){
        this.password = newPassword;
    }

    public String getUsername(){
        return null;
    }

    public void setUsername(){

    }

    public String getPassword(){
        return null;
    }

    public void setPassword(){

    }

    public int getStreak(){
        return streak;
    }

    public void setStreak(){
        this.streak = streak;
    }

    public boolean getLogout(){
        return true;
    }

    public HashMap<Language, Progress> getLanguages(){
        return languages;
    }

}
