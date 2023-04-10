import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many kilometers is the distance? ");
        Scanner distance = new Scanner(System.in);
        double d = distance.nextDouble();
        System.out.print("What is the fuel consumption of your car?(in 100 km):");
        Scanner masraf = new Scanner(System.in);
        double m = masraf.nextDouble();
        System.out.print("What is the price of fuel?(toman):");
        Scanner fuel = new Scanner(System.in);
        double f = fuel.nextDouble();
        double masrafKhodro = m / 100;
        double pay = masrafKhodro * d * f;
        System.out.print("you have to pay :" + pay + "toman");


    }
}