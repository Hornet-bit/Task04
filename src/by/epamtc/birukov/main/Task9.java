package by.epamtc.birukov.main;

public class Task9 {
    public static void main(String[] args) {

        int mul = 1;
        long summ = 0;

        for (long i = 2; i <= 10; i++) {

            summ = summ + i;
            mul *= summ;

        }

        System.out.println(mul);

    }


}

