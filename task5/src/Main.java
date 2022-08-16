import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = console.nextInt();
        System.out.println("Введите второе число:");
        int b = console.nextInt();

        Scanner console2 = new Scanner(System.in);
        System.out.println("Введите знак операции:");
        String operation = console2.nextLine();

        int result = 0;
        switch (operation) {
            case "+": result = a + b;
                break;
            case "-": result = a - b;
                break;
            case "/": result = a / b;
                break;
            case "*": result = a * b;
                break;
            default: System.out.println("Неверно введен знак операции");
                break;
        }
        System.out.println(result);
    }
}
