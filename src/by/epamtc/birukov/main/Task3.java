package by.epamtc.birukov.main;

public class Task3 {
    public static void main(String[] args) {


        double a = 13;
        double b = -2.4;
        double c = 54;


        if (a > b && b > c) {

            a *= 2;
            b *= 2;
            c *= 2;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } else {

            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }


}

