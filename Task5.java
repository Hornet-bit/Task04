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

    static int multiplicationOfDigits(int number) {

        int multiplication = 1;
        while (number != 0) {
            multiplication *= number % 10;
            number /= 10;
        }

        return multiplication;

    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    static int fourDigitNum(int number) {

        int temp = number % 10;
        temp *= 1000;
        number += temp;
        return number;
    }

}
