import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your first numerator & denominator : ");
        Scanner a1 = new Scanner(System.in);
        double a = a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        double b = b1.nextDouble();
        System.out.println("enter your second numerator & denominator : ");
        Scanner a2 = new Scanner(System.in);
        double c = a2.nextDouble();
        Scanner b2 = new Scanner(System.in);
        double d = b2.nextDouble();
        double first = a/b;
        double second = c/d;
        System.out.print("result : " + first * second);
    }
}