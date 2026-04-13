import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatterns cp = new CharacterPatterns();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine().toUpperCase();

        char[] word = input.toCharArray();

        for (int i = 0; i < 7; i++) {
            for (char ch : word) {
                String[] pattern = cp.getPattern(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "   ");
                } else {
                    System.out.print("       "); // for unknown chars
                }
            }
            System.out.println();
        }

        sc.close();
    }
}