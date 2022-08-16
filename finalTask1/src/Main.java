import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара:");
        Scanner console1 = new Scanner(System.in);
        double rate = console1.nextDouble();
        System.out.println("Введите количество рублей:");
        Scanner console2 = new Scanner(System.in);
        double rub = console2.nextDouble();

        double dollars = Math.floor(rub / rate * 100) / 100;
        System.out.println("Курс доллара: " + rate + "\n" +
                "Количество рублей: " + rub + "\n" +
                "Доллары: " + dollars);
    }
}
