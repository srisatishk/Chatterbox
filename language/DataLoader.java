package language;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale.Category;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataLoader extends DataConstants {

    private static final String USER_FILE_NAME = null;
    private static final String CATEGORY_SYSTEM_FILE_NAME = null;
    private static final String CATEGORY_FILE_NAME = null;
    private static final String WORDLIST_FILE_NAME = null;

    // Method to get a list of Users from a JSON file
    public static ArrayList<UserList> getUserList() {
        ArrayList<UserList> users = new ArrayList<>();

        try (FileReader reader = new FileReader(USER_FILE_NAME)) {
            JSONArray usersJSON = new JSONArray();

            for (int i = 0; i < ((CharSequence) usersJSON).length(); i++) {
                JSONObject userJSON = ((Object) usersJSON).getJSONObject(i);
                users.add(getUserFromJSON(userJSON));
            }

        } catch (IOException e) {
            System.err.println("Error reading user data from file: " + USER_FILE_NAME);
            e.printStackTrace();
        }

        return users;
    }

    // Method to get a list of Categories from a JSON file
    public static ArrayList<Category> getCategorySystem() {
        ArrayList<Category> categories = new ArrayList<>();

        try (FileReader reader = new FileReader(CATEGORY_SYSTEM_FILE_NAME)) {
            JSONArray categoriesJSON = new JSONArray();

            for (int i = 0; i < ((CharSequence) categoriesJSON).length(); i++) {
                JSONObject categoryJSON = ((Object) categoriesJSON).getJSONObject(i);
                categories.add(getCategoryFromJSON(categoryJSON));
            }

        } catch (IOException e) {
            System.err.println("Error reading category data from file: " + CATEGORY_SYSTEM_FILE_NAME);
            e.printStackTrace();
        }

        return categories;
    }

    // Method to get a list of Questions from a JSON file
    public static ArrayList<Question> getCategoryQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        try (FileReader reader = new FileReader(CATEGORY_FILE_NAME)) {
            JSONArray questionsJSON = new JSONArray();

            for (int i = 0; i < ((CharSequence) questionsJSON).length(); i++) {
                JSONObject questionJSON = questionsJSON.getJSONObject(i);
                questions.add(getQuestionFromJSON(questionJSON));
            }

        } catch (IOException e) {
            System.err.println("Error reading question data from file: " + CATEGORY_FILE_NAME);
            e.printStackTrace();
        }

        return questions;
    }

    // Method to get a list of Words from a JSON file
    public static ArrayList<Word> getWordList() {
        ArrayList<Word> words = new ArrayList<>();

        try (FileReader reader = new FileReader(WORDLIST_FILE_NAME)) {
            JSONArray wordsJSON = new JSONArray();

            for (int i = 0; i < ((CharSequence) wordsJSON).length(); i++) {
                JSONObject wordJSON = ((Object) wordsJSON).getJSONObject(i);
                words.add(getWordFromJSON(wordJSON));
            }

        } catch (IOException e) {
            System.err.println("Error reading word data from file: " + WORDLIST_FILE_NAME);
            e.printStackTrace();
        }

        return words;
    }

    // Helper method to create a User object from JSON
    private static UserList getUserFromJSON(JSONObject json) {
        String name = json.toJSONString();
        String id = json.toJSONString();
        return new UserList();
    }

    // Helper method to create a Category object from JSON
    private static Category getCategoryFromJSON(JSONObject json) {
        String name = json.toJSONString();
        return new Category(name);
    }

    // Helper method to create a Question object from JSON
    private static Question getQuestionFromJSON(JSONObject json) {
        String questionText = json.toJSONString();
        return new Question();
    }

    // Helper method to create a Word object from JSON
    private static Word getWordFromJSON(JSONObject json) {
        String wordText = json.toJSONString();
        String definition = json.toJSONString();
        return new Word();
    }
}
