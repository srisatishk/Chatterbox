package language;
import java.util.UUID;

import org.json.simple.JSONArray;

import java.util.List;

public class Course {
    /**
     * attributes to match courses.json
     */
    private UUID userID; 
    private UUID courseID;
    private String course;
    private String language;
    private List<String> categories;
    private String category;

    public Course(UUID userID, UUID courseID, String course, String language, List<String> categories, String category ){
        this.userID = userID;
        this.courseID = courseID;
        this.course = course;
        this.language = language;
        this.categories = categories;
        this.category = category;
    }


    public UUID getID(){
        return userID;
    }

    public void setId(UUID ID){
        this.userID = ID;
    }
    
    public UUID getCourseID(){
        return courseID;
    }

    public void setCourseID(UUID courseID){
        this.courseID = courseID;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public List<String> getCategories(){
        return categories;
    }

    public void setCategories(List<String> categories){
        this.categories = categories;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
