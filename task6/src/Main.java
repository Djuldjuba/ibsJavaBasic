import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("�������� ��� ����������: 1 - �����, 2 - ����������");
        Scanner console1 = new Scanner(System.in);
        int a = console1.nextInt();
        System.out.println("�������� ������� ���������: 1 - ��, 2 - ����, 3 - �����, 4 - ����, 5 - ����, 6 - ���, 7 - ���");
        Scanner console2 = new Scanner(System.in);
        int unitOfMeasurement = console2.nextInt();
        System.out.println("������� ���������� ��������� ������:");
        Scanner console3 = new Scanner(System.in);
        double count = console3.nextDouble();

        double result = 0.0;
        if (a == 1) {
            switch (unitOfMeasurement) {
                case 1:
                    result = count;
                    System.out.println("����������: " + result);
                    break;
                case 2:
                    result = count * 2.205;
                    System.out.println("�����: " + result);
                    break;
                case 3:
                    result = count * 35.274;
                    System.out.println("�����: " + result);
                    break;
                default:
                    System.out.println("������� �������� ������� ���������");
            }
        } else if (a == 2) {
            switch (unitOfMeasurement) {
                case 4:
                    result = count;
                    System.out.println("�����: " + result);
                    break;
                case 5:
                    result = count * 0.000621;
                    System.out.println("����: " + result);
                    break;
                case 6:
                    result = count * 1.094;
                    System.out.println("����: " + result);
                    break;
                case 7:
                    result = count * 3.281;
                    System.out.println("����: " + result);
                    break;
                default:
                    System.out.println("������� �������� ������� ���������");
            }
        } else {
            System.out.println("������� �������� ������� ������ ��� ����������");
        }
    }
}
