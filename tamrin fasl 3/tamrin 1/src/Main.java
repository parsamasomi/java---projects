import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please make your move (1 - 10):");
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        Random random = new Random();
        int r = random.nextInt(10)+1;
        int playerMove = n*(r-n+1);
        System.out.println("your move is :" + playerMove);


    }
}