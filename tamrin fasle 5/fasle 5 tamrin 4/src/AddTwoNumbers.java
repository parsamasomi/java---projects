import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num1 = new int[30];
        int[] num2 = new int[30];
        int[] result = new int[30];
        boolean carry = false;

        System.out.print("Enter the first number: ");
        String input1 = scanner.next();
        for (int i = 0; i < input1.length(); i++) {
            num1[30 - input1.length() + i] = input1.charAt(i) - '0';
        }

        System.out.print("Enter the second number: ");
        String input2 = scanner.next();
        for (int i = 0; i < input2.length(); i++) {
            num2[30 - input2.length() + i] = input2.charAt(i) - '0';
        }

        for (int i = 29; i >= 0; i--) {
            int sum = num1[i] + num2[i];
            if (carry) {
                sum++;
                carry = false;
            }
            if (sum > 9) {
                carry = true;
                sum %= 10;
            }
            result[i] = sum;
        }

        System.out.print("The result is: ");
        boolean printLeadingZeros = true;
        for (int i = 0; i < 30; i++) {
            if (printLeadingZeros && result[i] == 0) {
                continue;
            }
            printLeadingZeros = false;
            System.out.print(result[i]);
        }
        if (printLeadingZeros) {
            System.out.print("0");
        }
        System.out.println();
    }
}