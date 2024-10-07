package Narrator.speek.src.main.java;

import java.util.HashMap;
import java.util.Map;

public class VoiceList {

    // Store available voices in a map with a description and corresponding Polly voice ID.
    private static final Map<String, String> voices = new HashMap<>();

    static {
        // English voices
        voices.put("English - Joanna", "Joanna");  // Female English (US)
        voices.put("English - Matthew", "Matthew"); // Male English (US)
        voices.put("English - Ivy", "Ivy"); // Female Childlike English (US)
        voices.put("English - Brian", "Brian"); // Male English (UK)
        voices.put("English - Amy", "Amy"); // Female English (UK)

        // Spanish voices
        voices.put("Spanish - Miguel", "Miguel"); // Male Spanish (US)
        voices.put("Spanish - Penelope", "Penelope"); // Female Spanish (US)
        voices.put("Spanish - Lucia", "Lucia"); // Female Spanish (EU)

        // French voices
        voices.put("French - Celine", "Celine"); // Female French (FR)
        voices.put("French - Mathieu", "Mathieu"); // Male French (FR)

        // German voices
        voices.put("German - Vicki", "Vicki"); // Female German (DE)
        voices.put("German - Hans", "Hans"); // Male German (DE)

        // Japanese voices
        voices.put("Japanese - Takumi", "Takumi"); // Male Japanese
        voices.put("Japanese - Mizuki", "Mizuki"); // Female Japanese
    }

    // Method to get the Polly Voice ID by description (e.g., "English - Joanna")
    public static String getVoiceId(String description) {
        return voices.get(description);
    }

    // Method to print available voices
    public static void printAvailableVoices() {
        System.out.println("Available voices:");
        for (String description : voices.keySet()) {
            System.out.println(description);
        }
    }

    public static void main(String[] args) {
        // Example usage: print all available voices
        VoiceList.printAvailableVoices();

        // Get a specific voice ID (e.g., "English - Joanna")
        String voiceId = VoiceList.getVoiceId("English - Joanna");
        System.out.println("Voice ID for 'English - Joanna' is: " + voiceId);
    }
}
