import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatterns cp = new CharacterPatterns();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine().toUpperCase();

        char[] word = input.toCharArray();

        // Validate characters
        for (char ch : word) {
            if (!cp.hasCharacter(ch)) {
                System.out.println("Warning: '" + ch + "' not supported");
            }
        }

        System.out.println();

        // Print banner
        for (int i = 0; i < 7; i++) {
            for (char ch : word) {

                if (cp.hasCharacter(ch)) {
                    String[] pattern = cp.getPattern(ch);
                    System.out.print(pattern[i] + "   ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}