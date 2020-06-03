public class Task7 {


    public static void main(String[] args) {

        double number = 123.456;

        double doublePart = revertingIntegerPart(number);
        int integerPart = revertingDoublePart(number);
        double result = sum(integerPart, doublePart);
        System.out.println(result);


    }

    static int revertingDoublePart(double number) {
        double tempDecimal = number * 1000;

        tempDecimal = tempDecimal % 1000;
        return (int) tempDecimal;
    }

    static double revertingIntegerPart(double number) {
        int tempInteger = (int) number;
        double revesreInteger = tempInteger;
        revesreInteger /= 1000;
        return revesreInteger;
    }

    static double sum(int integerPart, double doulePart) {

        return integerPart + doulePart;
    }


}
