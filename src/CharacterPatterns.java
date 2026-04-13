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

    public void printCharacter(char ch) {
        String[] pattern = patterns.get(ch);

        for (String line : pattern) {
            System.out.println(line);
        }
    }
}