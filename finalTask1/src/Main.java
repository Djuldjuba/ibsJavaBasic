import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������� ������� ���� �������:");
        Scanner console1 = new Scanner(System.in);
        double rate = console1.nextDouble();
        System.out.println("������� ���������� ������:");
        Scanner console2 = new Scanner(System.in);
        double rub = console2.nextDouble();

        double dollars = Math.floor(rub / rate * 100) / 100;
        System.out.println("���� �������: " + rate + "\n" +
                "���������� ������: " + rub + "\n" +
                "�������: " + dollars);
    }
}
