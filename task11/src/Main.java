import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������� ������ �����");
        Scanner console1 = new Scanner(System.in);
        String first = console1.nextLine();

        System.out.println("������� ������ �����");
        Scanner console2 = new Scanner(System.in);
        int second = console2.nextInt();

        Integer firstInt = Integer.valueOf(first);
        System.out.println("������� ����� �����: " + Math.max(firstInt, second));
        System.out.println("������� ����� �����: " + (double) Math.min(firstInt, second));
    }
}
