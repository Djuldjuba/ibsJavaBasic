import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("��������� �������:" + "\n" +
                "����� ���, �� ��� ��� ����, ��� ��� ���������, ��� ����� ���������");
        String correctAnswer = "���������������� �����";
        String hint = "���������";

        for (int i = 0; i < 3; i++) {
            Scanner console = new Scanner(System.in);
            String answer = console.nextLine();

            if (answer.equals(hint) && i == 0) {
                System.out.println("� ���� ������� ���� ���� � ����������� ���������");
                i = 1;
                continue;
            }

            if (answer.equals(hint) && i != 0) {
                System.out.println("��������� ������ ����������");
                i = i - 1;
                continue;
            }

            if (answer.equals(correctAnswer)) {
                System.out.println("���������!");
                break;
            }

            if (!answer.equals(correctAnswer) && (i == 0 || i == 1)) {
                System.out.println("������� ���!");
                continue;
            }

            if (!answer.equals(correctAnswer) && i == 2) {
                System.out.println("������, ������� � ������ ���");
                break;
            }
        }
    }
}
