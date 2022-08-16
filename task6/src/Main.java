import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner console1 = new Scanner(System.in);
        int a = console1.nextInt();
        System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция, 4 - метр, 5 - миля, 6 - ярд, 7 - фут");
        Scanner console2 = new Scanner(System.in);
        int unitOfMeasurement = console2.nextInt();
        System.out.println("Введите количество выбранных единиц:");
        Scanner console3 = new Scanner(System.in);
        double count = console3.nextDouble();

        double result = 0.0;
        if (a == 1) {
            switch (unitOfMeasurement) {
                case 1:
                    result = count;
                    System.out.println("Килограммы: " + result);
                    break;
                case 2:
                    result = count * 2.205;
                    System.out.println("Фунты: " + result);
                    break;
                case 3:
                    result = count * 35.274;
                    System.out.println("Унции: " + result);
                    break;
                default:
                    System.out.println("Введена неверная единица измерения");
            }
        } else if (a == 2) {
            switch (unitOfMeasurement) {
                case 4:
                    result = count;
                    System.out.println("Метры: " + result);
                    break;
                case 5:
                    result = count * 0.000621;
                    System.out.println("Мили: " + result);
                    break;
                case 6:
                    result = count * 1.094;
                    System.out.println("Ярды: " + result);
                    break;
                case 7:
                    result = count * 3.281;
                    System.out.println("Футы: " + result);
                    break;
                default:
                    System.out.println("Введена неверная единица измерения");
            }
        } else {
            System.out.println("Введена неверная команда выбора что переводить");
        }
    }
}
