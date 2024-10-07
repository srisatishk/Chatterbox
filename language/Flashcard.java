package language;

/**
 * Name: Hardik Marlapudi
 * Date: 10/6/2024
 */

/**
 * The Flashcard class represents a single flashcard that contains a word,
 * its definition, the language of the word, and its category.
 * Each flashcard is uniquely identified by an id.
 */
public class Flashcard {

    /** The unique identifier for the flashcard. */
    private String id;

    /** The word or term on the flashcard. */
    private String word;

    /** The definition or meaning of the word. */
    private String definition;

    /** The language to which the word belongs. */
    private String language;

    /** The category of the word (e.g., grammar, vocabulary). */
    private String category;

    /**
     * Constructs a new Flashcard object with the specified details.
     *
     * @param id The unique identifier for the flashcard.
     * @param word The word or term on the flashcard.
     * @param definition The definition of the word.
     * @param language The language of the word.
     * @param category The category to which the word belongs.
     */
    public Flashcard(String id, String word, String definition, String language, String category) {
        this.id = id;
        this.word = word;
        this.definition = definition;
        this.language = language;
        this.category = category;
    }

    // Getters and setters

    /**
     * Returns the unique identifier of the flashcard.
     *
     * @return The id of the flashcard.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the flashcard.
     *
     * @param id The new id of the flashcard.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the word or term on the flashcard.
     *
     * @return The word on the flashcard.
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the word or term on the flashcard.
     *
     * @param word The new word for the flashcard.
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Returns the definition of the word on the flashcard.
     *
     * @return The definition of the word.
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the definition of the word on the flashcard.
     *
     * @param definition The new definition for the word.
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * Returns the language of the word on the flashcard.
     *
     * @return The language of the word.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language of the word on the flashcard.
     *
     * @param language The new language of the word.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Returns the category of the word on the flashcard.
     *
     * @return The category of the word.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the word on the flashcard.
     *
     * @param category The new category for the word.
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
