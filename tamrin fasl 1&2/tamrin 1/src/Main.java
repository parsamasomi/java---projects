import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("enter your seconds : ");
        Scanner input = new Scanner(System.in);
       int second = input.nextInt();
       int hour = second/3600;
       int min = (second%3600) / 60 ;
       int second_1 = (second%3600) % 60;
        System.out.println("your hour is :" + hour);
        System.out.println("your min is: " + min);
        System.out.println("your second is : " +second_1);
    }
}