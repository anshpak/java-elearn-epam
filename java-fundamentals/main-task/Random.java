/*
3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
*/
public class Random {
    public static void main(String[] args) {
        final int RANGE_FORM_HELPER1 = 200;
        final int RANGE_FORM_HELPER2 = 100;
        final int N = 10;
        double tempPreviousRandomNum = 0;
        for (int i = 0; i < N; i++) {
            double tempCurrentRandomNum = Math.random() * RANGE_FORM_HELPER1 - RANGE_FORM_HELPER2;
            if (tempCurrentRandomNum <= 0 && tempPreviousRandomNum <= 0 || tempCurrentRandomNum >= 0 && tempPreviousRandomNum >= 0) {
                System.out.print(tempCurrentRandomNum + " ");
            } else {
                System.out.print("\n" + tempCurrentRandomNum + " ");
            }
            tempPreviousRandomNum = tempCurrentRandomNum;
        }
    }
}
