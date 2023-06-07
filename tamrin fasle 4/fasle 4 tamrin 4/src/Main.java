import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        GradeCalculator calculator = new GradeCalculator();
        calculator.readGrades();
        calculator.calculateAverage();
        calculator.printResults();
    }
}