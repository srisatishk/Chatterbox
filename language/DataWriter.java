package language;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * The DataWriter class is responsible for writing flashcard data to a JSON file.
 * It takes a list of Flashcard objects and converts them into JSON format before
 * saving them to the file.
 */
public class DataWriter extends DataConstants {

   /** 
    * Path to the JSON file where user data will be written.
    */

<<<<<<< HEAD
       /**
    * Writes a list of users to the JSON file specified in FILE_PATH.
    * This method converts each User object into a JSON representation and writes
    * the entire list of users as a JSON array to the file.
    *
    * @param flashcards The list of Flashcard objects to be written to the file.
    */
=======
<<<<<<< HEAD
=======
>>>>>>> ab7c5fd0bcb3f704a014b1ff516176587890045b
   @SuppressWarnings("unchecked")
>>>>>>> 7ed635412a371749af1bcad9a68be8635b00e068
   public static void saveUsers() {
        UserList users = UserList.getInstance();
        ArrayList<User> userList = users.getUsers();
        JSONArray jsonUserList = new JSONArray();

        for (int i =0; i < userList.size(); i++) {
            jsonUserList.add(getUserJSON(userList.get(i)));
        }

<<<<<<< HEAD
       try (FileWriter file = new FileWriter(USER_FILE_PATH)) {
           file.write(jsonUserList.toJSONString());
           file.flush();
       } catch (IOException e) {
           e.printStackTrace();
       }
       
   }
  
   // (@SuppressWarnings("unchecked"))
=======
        try (FileWriter file = new FileWriter(FILE_NAME_USER)) {
 
            file.write(jsonUserList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
>>>>>>> 7ed635412a371749af1bcad9a68be8635b00e068
    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getId().toString());
		userDetails.put(USER_USERNAME, user.getUsername());
		userDetails.put(USER_FIRST_NAME, user.getFirstName());
		userDetails.put(USER_LAST_NAME, user.getLastName());
        userDetails.put(USER_USERNAME, user.getUsername());
        userDetails.put(USER_EMAIL, user.getEmail());
		userDetails.put(USER_PHONE_NUMBER, user.getPhoneNumber());
        userDetails.put(USER_DATE_OF_BIRTH, user.getDateOfBirth());
        userDetails.put(USER_PASSWORD, user.getPassword());
        userDetails.put(USER_STREAK, user.getStreak());

        return userDetails;
    }
<<<<<<< HEAD
=======

   
   /**
    * Writes a list of flashcards to the JSON file specified in FILE_PATH.
    * This method converts each Flashcard object into a JSON representation and writes
    * the entire list of flashcards as a JSON array to the file.
    *
    * @param flashcards The list of Flashcard objects to be written to the file.
    */
>>>>>>> 7ed635412a371749af1bcad9a68be8635b00e068

<<<<<<< HEAD
=======
  /* */
>>>>>>> ab7c5fd0bcb3f704a014b1ff516176587890045b
// (@SuppressWarnings("unchecked")) to get rid of the warnings.
@SuppressWarnings("unchecked")
public static void writeFlashcards(List<Flashcards> flashcards) {
        // Create a JSON array to hold flashcard data
        JSONArray flashcardList = new JSONArray();

        // Convert each Flashcard object to a JSON object
        for (Flashcards flashcard : flashcards) {
            JSONObject flashcardDetails = new JSONObject();

            flashcardDetails.put("word", flashcard.getWord());
            flashcardDetails.put("translation", flashcard.getTranslation());
            flashcardDetails.put("phrase", flashcard.getPhrase());

            // Add the flashcard JSON object to the array
            flashcardList.add(flashcardDetails);
        }

        // Write the JSON array to the file
        try (FileWriter file = new FileWriter(FILE_NAME_FLASHCARDS)) {
            file.write(flashcardList.toJSONString());  // Write JSON data to file
            file.flush();  // Ensure all data is written
        } catch (IOException e) {
            e.printStackTrace();  // Handle errors in writing to the file
        }
   }
<<<<<<< HEAD

   @SuppressWarnings("unchecked")
   public static void writeUsers(List<User> users) {
        JSONArray userList = new JSONArray();
        for (User user : users) {
            JSONObject userDetails = new JSONObject();
            //userDetails.put("id", user.getId().toString());
            userDetails.put("firstName", user.getFirstName());
            userDetails.put("lastName", user.getLastName());
            userDetails.put("email", user.getEmail());
            userDetails.put("phoneNumber", user.getPhoneNumber());
            userDetails.put("dateOfBirth", user.getDateOfBirth().toString());
            userDetails.put("username", user.getUsername());
            userDetails.put("password", user.getPassword());
            userList.add(userDetails);
        }

        try (FileWriter file = new FileWriter(USER_FILE_PATH)) {
            file.write(userList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
   
=======
>>>>>>> 7ed635412a371749af1bcad9a68be8635b00e068
}
