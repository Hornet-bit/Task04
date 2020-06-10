package by.epamtc.birukov.main;

public class Task1 {

    public static void main(String[] args) {

        double a = 2;
        double b = 4;
        double c = 3.5;

        if(a == 0 || b == 0){
            System.out.println("Выражение не имеет смысла");
        }

        double result;

        double numerator = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        double denominator = 2 * a;
        double term = Math.pow(a, 3) * c + Math.pow(b, -2);

        result = numerator/denominator + term;

        System.out.println(result);

    }
}
