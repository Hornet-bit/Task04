public class Task6 {
    public static void main(String[] args) {

        int a1 = 2000;
        int d = 100;

        long result = 0;

        result = a1;
        if (result < a1 + d) {
            System.out.println("возрастающая прогрессия");
            result = increaseValue(a1, d);
            System.out.println(result);


        } else {
            System.out.println("убывающая прогрессия");
            result = decreaseValue(a1, d);
            System.out.println(result);
        }
    }


    static int increaseValue(int a1, int d) {

        //при увелич. прогрессии:

        int numberOfSteps;
        int localResalt = 0;
        for (int i = 1; true; i++) {
            localResalt = a1 + (i - 1) * d;
            if (localResalt < a1 + i * d) {
//                переполнения нет, продолжаем

            } else {
//                 переполнение след. шагом!

                numberOfSteps = i + 1;
                break;
            }


        }

        return numberOfSteps;
    }

    static long increaseValue(long a1, long d) {

        //при увелич. прогрессии:

        int numberOfSteps;
        long localResalt = 0;
        for (int i = 1; true; i++) {
            localResalt = a1 + (i - 1) * d;
            if (localResalt < a1 + i * d) {
//переполнения нет, продолжаем

            } else {
//                переполнение след. шагом;

                numberOfSteps = i + 1;
                break;
            }


        }

        return numberOfSteps;
    }


    static int decreaseValue(int a1, int d) {
        int numberOfSteps;
        int localResalt = 0;
        for (int i = 1; true; i++) {
            localResalt = a1 + (i - 1) * d;
            if (localResalt > a1 + i * d) {
//"переполнения нет, продолжаем

            } else {
//переполнение след. шагом

                numberOfSteps = i + 1;
                break;
            }

        }
        return numberOfSteps;
    }

    static long decreaseValue(long a1, long d) {
        int numberOfSteps;
        long localResalt = 0;
        for (int i = 1; true; i++) {
            localResalt = a1 + (i - 1) * d;
            if (localResalt > a1 + i * d) {
//                переполнения нет, продолжаем
            } else {
//переполнение след. шагом

                numberOfSteps = i + 1;
                break;
            }


        }

        return numberOfSteps;


    }
}


