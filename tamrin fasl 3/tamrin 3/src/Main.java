import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your m , n:");
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double n = scanner.nextInt();
        double side_1 = (pow(m,2)-pow(n,1));
        double side_2 = 2*m*n;
        double hypotenuse = pow(m,2)+pow(n,2);
        System.out.println("side_1 :"+side_1+"\n"+ "side_2 :"+side_2+"\n" + "hypotenuse :" +hypotenuse);


    }
}