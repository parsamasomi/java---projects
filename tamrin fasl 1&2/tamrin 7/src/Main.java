import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter x , y , z :");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double result_1 = round((pow(x , y) + pow( y , x)) /abs(z));
        double result_2 = floor((exp(y))  - (log(x*z)));
        double result_3 = ceil((max(x,y)) % (min(y,z)));
        System.out.println("your first answer is :" +result_1 + "\n" +"your second answer is :" + result_2 +"\n"+ "your third answer is :"+ result_3);



    }

    }