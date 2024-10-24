package language;
import java.util.UUID;
import java.util.List;

public class Course {
    /**
     * attributes to match courses.json
     */
    private UUID id; 
    private UUID courseID;
    private String course;
    private String language;
    private List<String> categories;
    private List<String> lessons;
    private String category;

    public Course(UUID id, UUID courseID, String course, String language, List<String> categories, List<String> lessons, String category ){
        this.id = id;
        this.courseID = courseID;
        this.course = course;
        this.language = language;
        this.categories = categories;
        this.lessons = lessons;
        this.category = category;
    }

    public UUID getId(){
        return id;
    }

    public void setId(UUID id){
        this.id = id;
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

    public List<String> getLessons(){
        return lessons;
    }

    public void setLessons(List<String> lessons){
        this.lessons = lessons;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
