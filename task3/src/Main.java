public class Main {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[] {7, 1, 4, 11, 5};
        int first = myArray[0];
        int last = myArray[myArray.length - 1];
        myArray[0] = last;
        myArray[myArray.length - 1] = first;

        int newFirst = myArray[0];
        int newLast = myArray[myArray.length - 1];

        int sum = newFirst + (newFirst + (newFirst - newLast) / 2);
        System.out.println("Сумма первого и среднего элемента массива равна: " + sum);
    }
}
