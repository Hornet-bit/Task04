import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
//        Напишите программу, которая для введенной последовательности целых ненулевых
//        чисел (признак окончания ввода - ввод 0, количество чисел не меньше 2) определяет:
//
//        является ли последовательность возрастающей;
//        есть ли в ней хотя бы одна пара одинаковых соседних чисел;
//        является ли последовательность знакочередующейся (3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет);

//        Для ввода значений с клавиатуры можно воспользваться классом Scanner.
//                *Примечание: массив или коллекцию для решения этой задачи использовать нельзя.


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
            if(a*b>0){
                alternating = false;
            }

        }
        prinerIfo(increasing, equalNumber, alternating);

    }

    static void prinerIfo(boolean increasing, boolean equalNumber, boolean alternating) {
        if(increasing){
            System.out.println("Последовательноость возрастающая");
        }
        if (equalNumber){
            System.out.println("В последовательности присутствуют одинаковые числа");
        }
        if (alternating){
            System.out.println("Последовательность знакочередующаяся");
        }

    }

}
