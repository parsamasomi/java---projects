import java.util.Arrays;
import java.util.Comparator;

public class ExamScores {

    private String correctAnswers;
    private int numStudents;
    private int[] scores;
    private int[][] studentData;

    public ExamScores(String[] data, String correctAnswers) {
        this.correctAnswers = correctAnswers;
        this.numStudents = data.length;
        this.scores = new int[numStudents];
        this.studentData = new int[numStudents][2];

        for (int i = 0; i < numStudents; i++) {
            String[] parts = data[i].split(" ");
            int studentId = Integer.parseInt(parts[0]);
            String answers = parts[1];
            int numCorrectAnswers = 0;

            for (int j = 0; j < answers.length(); j++) {
                if (answers.charAt(j) == correctAnswers.charAt(j)) {
                    numCorrectAnswers++;
                }
            }

            scores[i] = numCorrectAnswers * 100 / correctAnswers.length();
            studentData[i][0] = studentId;
            studentData[i][1] = scores[i];
        }
    }

    public void sortStudentData() {
        Arrays.sort(studentData, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[1], o1[1]);
            }
        });
    }

    public void printExamScores() {
        System.out.println("ID\tScore\tRank");
        for (int i = 0; i < numStudents; i++) {
            int rank = i + 1;
            if (i > 0 && studentData[i][1] == studentData[i - 1][1]) {
                rank = i;
            }

            System.out.print(studentData[i][0] + "\t" + studentData[i][1] + "\t");
            if (rank == 1) {
                System.out.println("best");
            } else if (rank == 2) {
                System.out.println("best-");
            } else if (rank == 3) {
                System.out.println("best-");
            } else if (scores[i] >= 90) {
                System.out.println("A");
            } else if (scores[i] >= 80) {
                System.out.println("B");
            } else if (scores[i] >= 70) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }

    public static void main(String[] args) {
        String[] data = {
                "0080 FTTFTFTTFT",
                "0340 FTFTFTTTFF",
                "0341 FTTFTTTTTT",
                "0401 TTFFTFFTTT",
                "0462 TTFTTTFFTF",
                "0463 TTTTTTTTTT",
                "0464 FTFFTFFTFT",
                "0512 TFTFTFTFTF",
                "0618 TTTFFTTFTF",
                "0619 FFFFFFFFFF",
                "0687 TFTTFTTFTF",
                "0700 FTFFTTFFFT",
                "0712 FTFTFTFTFT",
                "0837 TFTFTTFTFT"
        };

        String correctAnswers = "FTFFTFFTFT";
        ExamScores examScores = new ExamScores(data, correctAnswers);
        examScores.sortStudentData();
        examScores.printExamScores();
    }
}