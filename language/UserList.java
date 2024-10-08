package language;

import java.util.ArrayList;
/**
 * @author zaniah
 */
public class UserList {
    /**
     * attributes for userlist
     */
    private static UserList userList;
    private ArrayList<User> users;

    /**
     * private constructor
     */
    UserList(){
        //this.users = new ArrayList<>();
        //users = DataLoader.getUserList();
        userList = DataLoader.getUser();
    }

    /**
     * getnstance method (singleton design pat.)
     * creates one instance of the user list
     * @return a single instance of the list
     */
    public static UserList getInstance(){
        if (userList == null){
            userList = new UserList();
        }
        return userList;
    }

    /**
     * getUser method
     * retrieves the users info (username)
     * @param username the users username that they created
     * @return users username
     */
    public User getUser(String username){
        for(User user : userList){
            if(user.getUsername().equals(username)){
                return user;
        
    }

    /**
     * addUser method
     * adds the users info to the app to create account
     * @param firstName users first name
     * @param lastName users last name
     * @param email users email
     */
    public void addUser(String firstName, String lastName, String email){
        UserList.add(new User(firstName, lastName, email));
    }

    /**
     * editUser method
     * able to make any changes to the info the user provided
     * @param firstName users first name
     * @param lastName users last name
     * @param email users email
     */
    public void editUser(String firstName, String lastName, String email){

    }

    /**
     * saveUsers method
     * saves all the users info (first, last, email)
     */
    public void saveUsers(){
        DataWriter.saveUsers;
    }
    
}
