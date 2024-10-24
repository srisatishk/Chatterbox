package language;
import java.util.UUID;

import org.json.simple.JSONArray;

import java.util.List;

public class Course {
    /**
     * attributes to match courses.json
     */
    private UUID userid; 
    private UUID courseID;
    private String course;
    private String language;
    private List<String> categories;
    private String category;

    public Course(UUID id, UUID courseID, String course, String language, List<String> categories, String category ){
        this.userid = userid;
        this.courseID = courseID;
        this.course = course;
        this.language = language;
        this.categories = categories;
        this.category = category;
    }

    public Course(UUID userID, UUID courseID2, String course2, String language2, String category2,
            JSONArray categories2) {
        //TODO Auto-generated constructor stub
    }

    public UUID getId(){
        return userid;
    }

    public void setId(UUID id){
        this.userid = id;
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
