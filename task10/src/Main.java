import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите количество строк матрицы");
        Scanner console = new Scanner(System.in);
        int rows = console.nextInt();

        System.out.println("¬ведите количество столбцов матрицы");
        Scanner console1 = new Scanner(System.in);
        int columns = console1.nextInt();

        int[][] matrix;
        matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("¬ведите элемент массива:");
                Scanner console2 = new Scanner(System.in);
                int elementMassive = console2.nextInt();
                matrix[i][j] = elementMassive;
            }
        }

        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}
