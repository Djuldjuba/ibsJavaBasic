import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner console1 = new Scanner(System.in);
        String first = console1.nextLine();

        System.out.println("Введите второе число");
        Scanner console2 = new Scanner(System.in);
        int second = console2.nextInt();

        Integer firstInt = Integer.valueOf(first);
        System.out.println("Большее число равно: " + Math.max(firstInt, second));
        System.out.println("Меньшее число равно: " + (double) Math.min(firstInt, second));
    }
}
