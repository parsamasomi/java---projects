import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        float sum = 0;
        float[] grades = new float[100];
        Student[] students = new Student[100];

        while (true) {
            System.out.print("Enter grade (-1 to stop): ");
            float grade = scanner.nextFloat();
            if (grade == -1) {
                break;
            }
            grades[n] = grade;
            sum += grade;
            n++;
        }

        float average = sum / n;

        for (int i = 0; i < n; i++) {
            students[i] = new Student("Student " + (i + 1), grades[i]);
            students[i].calculateRank(average);
        }

        System.out.println("Grade  Rank");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getGrade() + "      " + students[i].getRank());
        }

        System.out.println("Average grade: " + average);
    }
}

class Student {
    private String name;
    private float grade;
    private char rank;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public char getRank() {
        return rank;
    }

    public void calculateRank(float average) {
        if (grade > 10 + average) {
            rank = 'C';
        } else if (grade > average) {
            rank = 'B';
        } else {
            rank = 'A';
        }
    }
}