/*
2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
*/
public class Arguments {
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("No arguments were given.");
        } else {
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.print(args[i] + " ");
            }
        }
    }
}
