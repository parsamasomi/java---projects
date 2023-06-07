import java.util.*;

public class Hangman {
    private static final String[] WORDS = {"JAVA", "PYTHON", "COMPUTER", "PROGRAMMING", "ALGORITHM"};
    private static final int MAX_TRIES = 6;
    private static final char PLACEHOLDER = '*';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String word = WORDS[random.nextInt(WORDS.length)];
        char[] solution = new char[word.length()];
        Arrays.fill(solution, PLACEHOLDER);

        int triesLeft = MAX_TRIES;
        Set<Character> guessedChars = new HashSet<>();

        while (triesLeft > 0) {
            System.out.println("Solution: " + new String(solution));
            System.out.println("Tries left: " + triesLeft);
            System.out.print("Guess a character: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            if (guessedChars.contains(guess)) {
                System.out.println("You have already guessed the character " + guess + ".");
            } else {
                guessedChars.add(guess);

                boolean found = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        solution[i] = guess;
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Correct guess!");
                } else {
                    System.out.println("Wrong guess!");
                    triesLeft--;
                }
            }

            if (Arrays.equals(solution, word.toCharArray())) {
                System.out.println("Congratulations! You have won!");
                return;
            }
        }

        System.out.println("Sorry, you have lost. The word was " + word + ".");
    }
}