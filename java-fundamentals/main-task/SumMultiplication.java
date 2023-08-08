/*
4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
*/
 */
public class SumMultiplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given.");
        }
        else {
            int sum = 0;
            int mult = 1;
            for (String num : args
            ) {
                sum += Integer.parseInt(num);
                mult *= Integer.parseInt(num);
            }
            System.out.print("Sum: " + sum + "; Multiplication: " + mult + ".");
        }
    }
}
