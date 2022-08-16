import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MIN = -20;
        final int MAX = 20;
        int[] numbers;
        numbers = new int[15];

        int maxValue = 0;
        int minValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(MAX - MIN) + MIN;
            System.out.println(numbers[i]);
            maxValue = Math.max(maxValue, numbers[i]);
            minValue = Math.min(minValue, numbers[i]);
        }
        int largestModule = Math.max(Math.abs(maxValue), Math.abs(minValue));
        System.out.println("Наибольшее число по модулю: " + largestModule);
    }
}
