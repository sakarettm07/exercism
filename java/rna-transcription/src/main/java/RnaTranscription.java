import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {
    Map<Character, String> translation;
    
    public RnaTranscription() {
        translation = new HashMap<>();
        translation.put('C', "G");
        translation.put('G', "C");
        translation.put('T', "A");
        translation.put('A', "U");
    }

    public String ofDna(String dnaString) {
        if (dnaString.isEmpty())
            return "";

        StringBuilder rnaString = new StringBuilder();
        for (int i = 0; i < dnaString.length(); i++)
            rnaString.append(getTranslatedChar(dnaString.charAt(i)));

        return rnaString.toString();
    }

    private String getTranslatedChar(char currentChar) {
        return translation.get(currentChar);
    }
}
