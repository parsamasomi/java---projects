import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("please enter your sentence:");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String result_1 = first(x);
        String result_2 = second(x);
        String result_3 = third(x);
        String result_4 = fourth(x);
        String end = result_4+ " " + result_3+ " " + result_2+ " " + result_1;
        System.out.println("before :" + x);
        System.out.println("after :" + end);
    }
    public static String first(String x){
        int index = x.indexOf("*");
        return x.substring(0,index);
    }
    public static String second(String x){
        int index = x.indexOf("*")+1;
        String result = x.substring(index);
        int index_2 = result.indexOf("*");
        return result.substring(0 , index_2);
    }

    public static String third(String x) {
        int index = x.indexOf("*") + 1;
        String result = x.substring(index);
        int index_2 = result.indexOf("*") + 1;
        String result_2 = result.substring(index_2);
        int index_3 = result_2.indexOf("*");
        return result_2.substring(0 , index_3);
    }
    public static String fourth (String x){
        int index = x.indexOf("*") + 1;
        String result = x.substring(index);
        int index_2 = result.indexOf("*") + 1;
        String result_2 = result.substring(index_2);
        int index_3 = result_2.indexOf("*")+1;
        return result_2.substring(index_3);

    }

    }
