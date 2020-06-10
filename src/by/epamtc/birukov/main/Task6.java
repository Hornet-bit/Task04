package by.epamtc.birukov.main;

public class Task6 {
    public static void main(String[] args) {

        int a1 = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        long result = 0;

        if (d > 0) {
            System.out.println("возрастающая прогрессия");
            result = increaseValue(a1, d);
            System.out.println(result);


        } else if (d < 0) {
            System.out.println("убывающая прогрессия");
            result = decreaseValue(a1, d);
            System.out.println(result);
        }
    }


    private static int increaseValue(int a1, int d) {

        int numberOfSteps;
        int localResalt = 0;

        for (int i = 0; true; i++) {
            localResalt += a1 + i * d;

            if (localResalt < 0) {
                numberOfSteps = i;
                break;
            }
        }
        return numberOfSteps;
    }


    private static long increaseValue(long a1, long d) {

        long numberOfSteps;
        long localResalt = 0;

        for (int i = 0; true; i++) {
            localResalt += a1 + i * d;

            if (localResalt < 0) {
                numberOfSteps = i;
                break;
            }
        }
        return numberOfSteps;
    }


    private static int decreaseValue(int a1, int d) {

        int numberOfSteps;
        int localResalt = 0;

        for (int i = 0; true; i++) {
            localResalt += a1 + i * d;

            if (localResalt > 0) {
                //       переполнение
                numberOfSteps = i;
                break;
            }
        }
        return numberOfSteps;
    }


    private static long decreaseValue(long a1, long d) {

        long numberOfSteps;
        long localResalt = 0;

        for (int i = 0; true; i++) {
            localResalt += a1 + i * d;

            if (localResalt > 0) {
                //       переполнение
                numberOfSteps = i;
                break;
            }
        }
        return numberOfSteps;
    }


}

