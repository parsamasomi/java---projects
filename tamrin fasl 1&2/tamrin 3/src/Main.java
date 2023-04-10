import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the length of the yard:");
        Scanner space_1 = new Scanner(System.in);
        double lengthYard = space_1.nextDouble();
        System.out.print("Enter the width of the yard:");
        Scanner space_2 = new Scanner(System.in);
        double widthYard = space_2.nextDouble();
        System.out.print("Enter the length of the house:");
        Scanner space_3 = new Scanner(System.in);
        double lengthHouse = space_3.nextDouble();
        System.out.print("Enter the width of the house:");
        Scanner space_4 = new Scanner(System.in);
        double widthHouse = space_4.nextDouble();
        double masahat = ((lengthYard * widthYard) - (lengthHouse * widthHouse)) / 2.3f;
        System.out.print("it will take : ");
        System.out.printf("%.2f" , (masahat/60));
        System.out.print(" min");







    }
}