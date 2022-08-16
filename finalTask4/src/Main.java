import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку:" + "\n" +
                "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String correctAnswer = "Заархивированный вирус";
        String hint = "Подсказка";

        for (int i = 0; i < 3; i++) {
            Scanner console = new Scanner(System.in);
            String answer = console.nextLine();

            if (answer.equals(hint) && i == 0) {
                System.out.println("В этой загадке речь идет о вредоносной программе");
                i = 1;
                continue;
            }

            if (answer.equals(hint) && i != 0) {
                System.out.println("Подсказка больше недоступна");
                i = i - 1;
                continue;
            }

            if (answer.equals(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            }

            if (!answer.equals(correctAnswer) && (i == 0 || i == 1)) {
                System.out.println("Подумай еще!");
                continue;
            }

            if (!answer.equals(correctAnswer) && i == 2) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
