public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatterns cp = new CharacterPatterns();

        char[] word = {'O', 'O', 'P', 'S'};

        for (int i = 0; i < 7; i++) {
            for (char ch : word) {
                String[] pattern = cp.getPattern(ch);
                System.out.print(pattern[i] + "   ");
            }
            System.out.println();
        }
    }
}