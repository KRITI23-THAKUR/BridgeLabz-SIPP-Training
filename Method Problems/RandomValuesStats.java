import java.util.Random;

public class RandomValuesStats {
    public int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // 4-digit number between 1000 and 9999
        }

        return numbers;
    }


    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValuesStats stats = new RandomValuesStats();
        int[] randomNumbers = stats.generate4DigitRandomArray(5);

        System.out.print("Generated numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        double[] results = stats.findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
