/*
1. Приветствовать любого пользователя при вводе его имени через командную строку.
*/
public class Hello {
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Hello, User!");
        } else {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}