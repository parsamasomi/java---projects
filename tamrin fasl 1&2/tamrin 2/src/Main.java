import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("enter first number :");
        Scanner number_1 = new Scanner(System.in);
        double a=number_1.nextDouble();
        System.out.print("enter second number :");
        Scanner number_2 = new Scanner(System.in);
        double b = number_2.nextDouble();
        double jam = a + b;
        double zarb = a * b;
        double taq = a / b;
        double taf = a - b;
        double baghi = a % b;
        System.out.println("your sum is: " + jam);
        System.out.println("your devision is :" + taq);
        System.out.println("your zarb is : " + zarb);
        System.out.println("your baghi is : " + baghi);
        System.out.println("your taf is : " + taf);
    }
}




