import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        translations.putIfAbsent(word, new ArrayList<String>());
        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (!translations.containsKey(word)){
            return new ArrayList<>(0);
        }
        return translations.get(word);
    }

    public void remove(String word) {
        translations.remove(word);
    }

    public HashMap getTranslations() {
        return translations;
    }

    @Override
    public String toString() {
        return "DictionaryOfManyTranslations{" +
                "translations=" + translations +
                '}';
    }
}
