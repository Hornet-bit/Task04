package by.epamtc.birukov.main;

public class Task7 {
    public static void main(String[] args) {

        double number = 123.456;


        double doublePart = integerToDouble(number);
        int integerPart = doubleToInteger(number);

        double result = integerPart + doublePart;

        System.out.println(result);


    }

    private static int doubleToInteger(double number) {

        double tempDecimal = number * 1000;
        tempDecimal = tempDecimal % 1000;

        return (int) tempDecimal;

    }

    private static double integerToDouble(double number) {

        int tempInteger = (int) number;
        double revesreInteger = tempInteger;
        revesreInteger /= 1000;

        return revesreInteger;
    }


}
