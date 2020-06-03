public class Task2 {
    public static void main(String[] args) {
        int[] AmoutOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] MonthName = {"Январь", "Февраль", " Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "декабрь"};

        int day = 153;

        for (int i = 0; i <= 11; i++) {

            if (day - AmoutOfDays[i] <= 0) {

                System.out.println(day + "\t " + MonthName[i]);
                break;


            } else {

                day -= AmoutOfDays[i];

            }
        }

    }
}
