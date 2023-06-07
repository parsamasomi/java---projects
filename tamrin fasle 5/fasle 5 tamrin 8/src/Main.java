import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to push an element to the stack.");
            System.out.println("Enter 2 to pop an element from the stack.");
            System.out.println("Enter 3 to get the size of the stack.");
            System.out.println("Enter 4 to print all elements in the stack.");
            System.out.println("Enter 5 to exit the program.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    String element = scanner.next();
                    stack.push(element);
                    System.out.println("The element " + element + " has been pushed to the stack.");
                    break;
                case 2:
                    try {
                        Object poppedElement = stack.pop();
                        System.out.println("The element " + poppedElement.toString() + " has been popped from the stack.");
                    } catch (EmptyStackException e) {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 3:
                    System.out.println("The size of the stack is: " + stack.size());
                    break;
                case 4:
                    stack.firstElement();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }

            System.out.println();
        }
    }
}