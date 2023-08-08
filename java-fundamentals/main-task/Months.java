/*
5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
*/
public class Months {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given.");
        } else if (args.length > 1) {
            System.out.println("Too much arguments were given.");
        } else {
            int monthNum = Integer.parseInt(args[0]);
            switch (monthNum) {
                case 1 -> System.out.print("January.");
                case 2 -> System.out.print("February.");
                case 3 -> System.out.print("March.");
                case 4 -> System.out.print("April.");
                case 5 -> System.out.print("May.");
                case 6 -> System.out.print("June.");
                case 7 -> System.out.print("July.");
                case 8 -> System.out.print("August.");
                case 9 -> System.out.print("September.");
                case 10 -> System.out.print("October.");
                case 11 -> System.out.print("November.");
                case 12 -> System.out.print("December.");
                default -> System.out.println("Wrong number input.");
            }
        }
    }
}
