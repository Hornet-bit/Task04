public class Task4 {

    public static void main(String[] args) {
        double x = 5.3;

        if (x <= 13) {

            countLess(x);
        } else {
            countMore(x);
        }
    }

    static double countLess(double x) {

        double value = -1 * Math.pow(x, 3) + 9;
        return value;
    }

    static double countMore(double x) {

        double value = -3 / (x + 1);
        return value;

    }
}
