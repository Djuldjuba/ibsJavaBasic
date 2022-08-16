import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите размер массива:");
        Scanner console = new Scanner(System.in);
        int sizeMassive = console.nextInt();

        double[] myArray;
        myArray = new double[sizeMassive];

        double sum = 0.0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("¬ведите элемент массива:");
            Scanner console1 = new Scanner(System.in);
            double elementMassive = console1.nextDouble();
            myArray[i] = elementMassive;
            sum += myArray[i];
        }

        double avg = sum / sizeMassive;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] *= avg);
        }
    }
}
