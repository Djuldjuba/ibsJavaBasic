import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("������� ������ �����:");
        int a = console.nextInt();
        System.out.println("������� ������ �����:");
        int b = console.nextInt();

        Scanner console2 = new Scanner(System.in);
        System.out.println("������� ���� ��������:");
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
            default: System.out.println("������� ������ ���� ��������");
                break;
        }
        System.out.println(result);
    }
}
