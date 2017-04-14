import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {
    Map<String, String> translation;
    public RnaTranscription() {
        translation = new HashMap<>();
        translation.put("C", "G");
        translation.put("G", "C");
    }

    public String ofDna(String dnaString) {
        if (dnaString.isEmpty())
            return "";
        else return translation.get(dnaString);
    }
}