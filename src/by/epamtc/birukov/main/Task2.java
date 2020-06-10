package by.epamtc.birukov.main;

public class Task2 {

    public static void main(String[] args) {

        int day = 34;


        int month = 1;
        int searchingDay = 0;
        boolean unknownMounth = true;

        while (unknownMounth) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    if (day - 31 <= 0) {
                        unknownMounth = false;
                        searchingDay = day;
                    }
                    else {
                        day -= 31;
                        month++;
                        break;

                    }
                case 4:
                case 6:
                case 9:
                case 11:

                    if (day - 30 <= 0) {
                        unknownMounth = false;
                        searchingDay = day;
                    }
                    else {
                        day -= 30;
                        month++;
                        break;
                    }
                case 2:
                    if (day - 28 <= 0) {
                        unknownMounth = false;
                        searchingDay = day;
                    }
                    else {
                        day -= 28;
                        month++;
                        break;
                    }
            }


        }
        System.out.println("Месяц "+month+" день "+ searchingDay);

    }
}
