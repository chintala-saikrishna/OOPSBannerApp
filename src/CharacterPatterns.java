import java.util.HashMap;

public class CharacterPatterns {

    private HashMap<Character, String[]> patterns = new HashMap<>();

    public CharacterPatterns() {

        patterns.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patterns.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        patterns.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });
    }

    public String[] getPattern(char ch) {
        return patterns.get(ch);
    }

    public boolean hasCharacter(char ch) {
        return patterns.containsKey(ch);
    }
}