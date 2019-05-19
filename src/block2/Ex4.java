package block2;
/*Заданы три целых числа, которые задают некоторую дату по Грегорианскому
календарю (https://ru.wikipedia.org/wiki/Григорианский_календарь). Определить
дату следующего дня. Запрещается использовать типы стандартной библиотеки
языка для работы с датой и временем. Также необходимо учесть то, что по
григорианскому календарю (используется в настоящий момент) високосный год
определяется следующим образом:
 годы, кратные 4 – високосные (например, 2008, 2012, 2016);
 годы, кратные 4 и 100 – невисокосные (например, 1700, 1800, 1900);
 годы, кратные 4, 100 и 400 – високосные (например, 1600, 2000, 2400).*/

import java.util.Scanner;

public class Ex4 {

    private static boolean isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int[] daysOfMonthYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  // первый ноль чтоб не было -1, т.к буду исспользовать в индексе массива
        int[] daysOfMonthLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day, month, year;
        System.out.println("Enter day DD");
        day = scanner.nextInt();
        System.out.println("Enter month MM");
        month = scanner.nextInt();
        System.out.println("Enter year");
        year = scanner.nextInt();
        System.out.println(isYearLeap(year));
        System.out.printf("Input date: %d.%d.%d. ", day, month, year);

        if (isYearLeap(year)) {
            if (daysOfMonthLeapYear[month] >= day + 1) {
                System.out.printf("Next date: %d.%d.%d. ", day + 1, month, year);
            } else if (month < 12) {
                day = 1;
                System.out.printf("Next date: %d.%d.%d. ", day, month + 1, year);
            } else {
                day = 1;
                month = 1;
                System.out.printf("Next date: %d.%d.%d. ", day, month, year + 1);
            }
        } else {
            if (daysOfMonthYear[month] >= day + 1) {
                System.out.printf("Next date: %d.%d.%d. ", day + 1, month, year);
            } else if (month < 12) {
                day = 1;
                System.out.printf("Next date: %d.%d.%d. ", day, month + 1, year);
            } else System.out.printf("Next date: %d.%d.%d. ", day == 1, month == 1, year + 1);
        }
        scanner.close();

    }

}
