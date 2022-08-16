import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое предложение");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String[] words = text.split("\\s+");
        String regex = "[A-Za-z]+";
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(regex) == true) {
                System.out.println(words[i]);
                count += 1;
            }
        }
        System.out.println("Количество слов на латинице: " + count);
    }
}
