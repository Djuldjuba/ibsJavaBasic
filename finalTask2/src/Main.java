import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите строку из 5 символов, ¬торой символ строки €вл€етс€ знаком С+Т или С-Т, четвертый символ строки С=Т.\n" +
                "ѕервым, третьим и п€тым символом €вл€ютс€ две цифры (от 0 до 9) и буква СxТ (обозначает неизвестное) в любом пор€дке.");
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
