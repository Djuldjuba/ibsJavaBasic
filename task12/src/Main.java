public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean result1;
        boolean result2;
        boolean result3;

        result1 = str.contains("Java");
        result2 = str.startsWith("I like");
        result3 = str.endsWith("!!!");

        if (result1 && result2 && result3) {
            String newStr = str.toUpperCase();
            System.out.println(newStr);
        }

        String strJovo = str.replace("a", "o");
        System.out.println(strJovo.substring(7, 11));
    }
}
