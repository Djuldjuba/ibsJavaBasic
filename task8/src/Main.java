import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������� ����� ����� ������������� ����� n:");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                result += i;
            }
        }
        System.out.println("����� ���� �������� ����� �� 1 �� n �����: " + result);
    }
}
