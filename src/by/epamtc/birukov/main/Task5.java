package by.epamtc.birukov.main;

public class Task5 {

    public static void main(String[] args) {


        int num = 652;
        int sum = sumOfDigits(num);
        System.out.println(sum);

        int mul = multiplicationOfDigits(num);
        System.out.println(mul);

        int fourDigit = fourDigitNum(num);
        System.out.println(fourDigit);


    }

    private static int multiplicationOfDigits(int number) {

        int multiplication = 1;
        while (number != 0) {
            multiplication *= number % 10;
            number /= 10;
        }

        return multiplication;

    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static int fourDigitNum(int number) {

        int numeral = number % 10;
        numeral *= 1000;
        number += numeral;
        return number;
    }
}
