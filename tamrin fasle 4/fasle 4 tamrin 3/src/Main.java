import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("لطفا یکی از موارد زیر را انتخاب کنید:");
        System.out.println("1- میلادی به روز سال");
        System.out.println("2- شمسی به روز سال");
        int option = input.nextInt();

        switch (option) {
            case 1:
                Date.convertToDayOfYear();
                break;

            case 2:
                Date.convertToIslamicDate();
                break;

            default:
                System.out.println("لطفا درست انتخاب کنید");
                break;
        }
    }

}