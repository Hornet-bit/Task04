package by.epamtc.birukov.main;

public class Task4 {
    public static void main(String[] args) {
        double x = 5.3;
        double value;
        if (x <= 13) {

            value = -1 * Math.pow(x, 3) + 9;
        } else {
            value = -3 / (x + 1);
        }

        System.out.println(value);
    }
}
