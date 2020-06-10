package by.epamtc.birukov.main;

public class Task8 {

    public static void main(String[] args) {

        double a = 2;
        double b = 8;
        final double c = 3;
        double h = 2;


        while (a <=b){

            double y = calcExpression(a, c);
            System.out.println(y);
            a+=h;
        }

    }

    private static double calcExpression(double argument, double c){

        double y;
        if (argument == 15){
            y = (argument+c)*2;
        }
        else {
            y = (argument - c)*2;
        }

        return y;
    }
}
