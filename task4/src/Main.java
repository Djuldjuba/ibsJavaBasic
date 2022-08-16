import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        int avg = Math.round((x + y + z) / 3);
        System.out.println("Среднее арифметическое равно: " + avg);
        int halfAvg = (int) Math.floor(avg / 2);
        if (halfAvg > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
