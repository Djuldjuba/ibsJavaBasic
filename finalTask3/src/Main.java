import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите количество строк n:");
        Scanner console1 = new Scanner(System.in);
        int count = console1.nextInt();

        String[] strings;
        strings = new String[count];

        String[] buffer;
        buffer = new String[count];

        int max = 0;
        String answer = "";

        for (int i = 0; i < strings.length; i++) {
            System.out.println("¬ведите любую строку:");
            Scanner console = new Scanner(System.in);
            String str = console.nextLine();
            strings[i] = str;
            buffer[i] = "";
            for (char c : strings[i].toCharArray()) {
                if (buffer[i].indexOf(c) == -1)
                    buffer[i] += c;
            }
            if (max < buffer[i].length()) {
                max = buffer[i].length();
                answer = strings[i];
            }
        }
        System.out.println("ќтвет: " + answer);
    }
}
