import java.util.*;

public class MorseCode {
    private static final String[] MORSE_CODE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", "-----", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toUpperCase();

        List<String> morseCodes = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                morseCodes.add(" ");
            } else if (c >= 'A' && c <= 'Z') {
                morseCodes.add(MORSE_CODE[c - 'A']);
            } else if (c == '.') {
                morseCodes.add(".-.-.-");
            }
        }

        System.out.println("Morse code:");
        for (String code : morseCodes) {
            System.out.print(code + " ");
        }
        System.out.println();

        System.out.println("Morse code by word:");
        for (String code : morseCodes) {
            if (code.equals(" ")) {
                System.out.println();
            } else {
                System.out.print(code + " ");
            }
        }
        System.out.println();
    }
}