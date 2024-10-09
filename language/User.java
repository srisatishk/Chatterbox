package language;
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
    private Date dateOfBirth;
    private String username;
    private String password;
    private HashMap<Language, Process> language;
    private int streak;

    public User(String firstName, String lastName, String email){
    }

    public String getFirstName(){
        return null;
    }

    public void setFirstName(){
    
    }

    public String getLastName(){
        return null;
    }

    public void setLastName(){

    }

    public String getEmail(){
        return null;
    }

    public void setEmail(){

    }

    public String getPhoneNumber(){
        return null;
    }

    public void setPhoneNumber(){

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
        return null;
    }

    public void setEnterUsername(){

    }

    public String getEnterPassword(){
        return null;
    }

    public void setEnterPassword(){

    }

    public void forgotPassword(){
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
        return 0;
    }

    public void setStreak(){

    }

    public boolean getLogout(){
        return true;
    }

    public HashMap<Language, Progress> getLanguages(){

    }

}
