import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int X = 3;
        final int Y = 4;
        final int Z = 5;

        System.out.println("Введите размер массива:");
        Scanner console = new Scanner(System.in);
        int sizeMassive = console.nextInt();

        int[] myArray;
        myArray = new int[sizeMassive];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Введите элемент массива:");
            Scanner console1 = new Scanner(System.in);
            int elementMassive = console1.nextInt();
            myArray[i] = elementMassive;
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == X || myArray[i] == Y || myArray[i] == Z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
