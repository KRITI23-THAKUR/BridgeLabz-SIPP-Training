import java.util.Scanner;

public class ScoreCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
// columns: Physics, Chemistry, Maths
        int[][] marks = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = avg;
            String grade = getGrade(percent);

            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%.2f\t%s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2],
                    total, avg, percent, grade);
        }
    }

    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }
}
