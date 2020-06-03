public class Task8 {

    public static void main(String[] args) {


        double a = 2; //начало отрезка
        double b = 18; // конец отрезка
        double h = 1; //шаг
        double x = 4.65;

        double y;


        double c = 1.2;
        for (double i = a; i <= b; i += h) {


            if (x == 15) {
                y = (x + c) * 2;
            } else {
                y = (x - c) + 6;
            }
            System.out.println(y);

        }

    }


}
