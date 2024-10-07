package language;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;

public class DataWriter extends DataConstants {

    // Saves the user list to the specified JSON file
    public static boolean saveUserList(ArrayList<UserList> users) {
        JSONArray jsonUsers = new JSONArray();

        for (UserList user : users) {
            jsonUsers.put(getUserJSON(user));
        }

        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            file.write(jsonUsers.toString());
            file.flush();
            return true;
        } catch (IOException e) {
            System.err.println("Error saving user list to file: " + USER_FILE_NAME);
            e.printStackTrace();
            return false;
        }
    }

    // Saves the category system (multiple categories) to the specified JSON file
    public static void saveCategorySystem(ArrayList<Category> categories) {
        JSONArray jsonCategories = new JSONArray();

        for (Category category : categories) {
            jsonCategories.put(getCategoryJSON(category));
        }

        try (FileWriter file = new FileWriter(CATEGORY_SYSTEM_FILE_NAME)) {
            file.write(jsonCategories.toString());
            file.flush();
        } catch (IOException e) {
            System.err.println("Error saving category system to file: " + CATEGORY_SYSTEM_FILE_NAME);
            e.printStackTrace();
        }
    }

    // Saves a single category to the specified JSON file
    public static void saveSingleCategory(Category category) {
        JSONObject jsonCategory = getCategoryJSON(category);

        try (FileWriter file = new FileWriter(CATEGORY_FILE_NAME)) {
            file.write(jsonCategory.toString());
            file.flush();
        } catch (IOException e) {
            System.err.println("Error saving single category to file: " + CATEGORY_FILE_NAME);
            e.printStackTrace();
        }
    }

    // Saves the word list to the specified JSON file
    public static void saveWordList(ArrayList<Word> words) {
        JSONArray jsonWords = new JSONArray();

        for (Word word : words) {
            jsonWords.put(getWordJSON(word));
        }

        try (FileWriter file = new FileWriter(WORDLIST_FILE_NAME)) {
            file.write(jsonWords.toString());
            file.flush();
        } catch (IOException e) {
            System.err.println("Error saving word list to file: " + WORDLIST_FILE_NAME);
            e.printStackTrace();
        }
    }

    // Converts a User object into a JSON object
    private static JSONObject getUserJSON(User user) {
        JSONObject json = new JSONObject();
        json.put("name", user.getName());
        json.put("id", user.getId());
        return json;
    }

    // Converts a Category object into a JSON object
    private static JSONObject getCategoryJSON(Category category) {
        JSONObject json = new JSONObject();
        json.put("name", category.getName());
        return json;
    }

    // Converts a Word object into a JSON object
    private static JSONObject getWordJSON(Word word) {
        JSONObject json = new JSONObject();
        json.put("word", word.getWord());
        json.put("definition", word.getDefinition());
        return json;
    }
}
