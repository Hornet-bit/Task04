public class Task9 {


    public static void main(String[] args) {
        int tempMul = 1;
//        BigDecimal tempDecimal = null;
//
//        for(int i = 2; i <= 11; i++) {
//            summation(i);
//            BigDecimal iDecimal = new BigDecimal(i);
//            tempDecimal = new BigDecimal(tempMul);
//            tempDecimal = tempDecimal.add(tempDecimal.multiply(iDecimal));
//
//        }
//        System.out.println(tempDecimal);


        for (long i = 2; i <= 11; i++) {
            summation(i);
            tempMul *= summation(i);
        }
        System.out.println(tempMul);

    }

    static long summation(long n) {
        long result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n + summation(n - 1);
        return result;
    }


}
