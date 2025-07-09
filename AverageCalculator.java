public class AverageCalculator {

    public static void main(String[] args) {
        int[] numbers = null;

        System.out.println("Average: " + calculateAverage(numbers));
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i <= arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }
}
