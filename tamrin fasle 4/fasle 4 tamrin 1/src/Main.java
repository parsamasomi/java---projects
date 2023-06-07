import java.util.*;

        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String[] words = new String[4];
                System.out.println("لطفا چهار کلمه وارد کنید:");
                for (int i = 0; i < words.length; i++) {
                    words[i] = scanner.next();
                }
                Arrays.sort(words);
                System.out.println("آرایه مرتب شده به صورت صعودی:");
                Process.printArray(words); //
                System.out.println("آرایه مرتب شده به صورت نزولی:");
                Process.printArrayReverse(words);
            }

        }









