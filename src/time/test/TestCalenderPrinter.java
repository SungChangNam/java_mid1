package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요 :");
        int year= scanner.nextInt();

        System.out.print("월을 입력하세요 :");
        int month=scanner.nextInt();

        printCalender(year,month);

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayMonth.plusMonths(1);

        //월요일=1(!%7=1) ... 일요일7(7%7=0)
        int offsetWeekDays = firstDayMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offsetWeekDays ; i++) {
            System.out.print("   ");
        }
        LocalDate dayIterator =firstDayMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek()== DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}