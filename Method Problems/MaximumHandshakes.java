public class MaximumHandshakes {
    public static int calculateHandshakes(int numberOfStudents) {
        return numberOfStudents * (numberOfStudents - 1) / 2;
    }

    public static void main(String[] args) {
        int students = 10;
        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum handshakes among " + students + " students: " + handshakes);
    }
}
