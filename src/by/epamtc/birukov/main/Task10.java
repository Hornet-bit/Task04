package by.epamtc.birukov.main;


import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean increasing = true;
        boolean equalNumber = false;
        boolean alternating = true;
        int a, b;


        b = scanner.nextInt();
        while (true) {
            a = b;

            b = scanner.nextInt();
            if (b == 0) {
                break;
            }
            if (a > b) {
                increasing = false;
            }
            if (a == b) {
                equalNumber = true;
            }
            if (a * b > 0) {
                alternating = false;
            }

        }
        prinerIfo(increasing, equalNumber, alternating);

    }

    static void prinerIfo(boolean increasing, boolean equalNumber, boolean alternating) {
        if (increasing) {
            System.out.println("Последовательноость возрастающая");
        }
        if (equalNumber) {
            System.out.println("В последовательности присутствуют одинаковые числа");
        }
        if (alternating) {
            System.out.println("Последовательность знакочередующаяся");
        }

    }
}
