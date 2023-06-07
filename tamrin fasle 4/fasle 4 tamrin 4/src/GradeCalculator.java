import java.util.Scanner;

public class GradeCalculator {

    private int outstanding; // 90 to 100
    private int satisfactory; // 60 to 89
    private int unsatisfactory; // 1 to 59
    private int sum;
    private double average;
    private int min;
    private int max;


    public GradeCalculator() {
        outstanding = 0;
        satisfactory = 0;
        unsatisfactory = 0;
        sum = 0;
        average = 0;
        min = 0;
        max = 0;
    }

    public void readGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("لطفا نمرات امتحانی را بین 1 تا 100 وارد کنید. برای پایان ورودی، عدد صفر را تایپ کنید.");
        while (true) {
            int grade = scanner.nextInt();

            if (grade == 0) {
                break;
            }


            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }

            if (grade >= 90 && grade <= 100) {
                outstanding++;
                System.out.println("نمره " + grade + " ممتاز است.");
            } else if (grade >= 60 && grade <= 89) {
                satisfactory++;
                System.out.println("نمره " + grade + " قبول است.");
            } else {
                unsatisfactory++;
                System.out.println("نمره " + grade + " مردود است.");
            }
        }
    }


    public void calculateAverage() {
        average = (double) sum / (outstanding + satisfactory + unsatisfactory);
    }

    public void printResults() {
        System.out.println("تعداد نمرات ممتاز: " + outstanding);
        System.out.println("تعداد نمرات قبول: " + satisfactory);
        System.out.println("تعداد نمرات مردود: " + unsatisfactory);
        System.out.println("میانگین نمرات: " + average);
        System.out.println("کمترین نمره: " + min);
        System.out.println("بیشترین نمره: " + max);
    }
}