import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������� ������ �� 5 ��������, ������ ������ ������ �������� ������ �+� ��� �-�, ��������� ������ ������ �=�.\n" +
                "������, ������� � ����� �������� �������� ��� ����� (�� 0 �� 9) � ����� �x� (���������� �����������) � ����� �������.");
        Scanner console = new Scanner(System.in);
        String equation = console.nextLine();

        String a = equation.substring(0, 1);
        String b = equation.substring(2, 3);
        String c = equation.substring(4);
        String sign = equation.substring(1, 2);

        int result = 0;
        if (a.equals("x") && sign.equals("-")) { //x-a=b
            result = Integer.parseInt(c) + Integer.parseInt(b);
        }
        if (a.equals("x") && sign.equals("+")) { //x+b=c
            result = Integer.parseInt(c) - Integer.parseInt(b);
        }
        if (b.equals("x") && sign.equals("-")) { //a-x=c
            result = Integer.parseInt(a) - Integer.parseInt(c);
        }
        if (b.equals("x") && sign.equals("+")) { //a+x=c
            result = Integer.parseInt(c) - Integer.parseInt(a);
        }
        if (c.equals("x") && sign.equals("-")) { //a-b=x
            result = Integer.parseInt(a) - Integer.parseInt(b);
        }
        if (c.equals("x") && sign.equals("+")) { //a+b=x
            result = Integer.parseInt(a) + Integer.parseInt(b);
        }
        System.out.println("x = " + result);
    }
}
