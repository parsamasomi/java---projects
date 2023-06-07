import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
    public static void convertToDayOfYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("روز: ");
        int day = input.nextInt();
        System.out.print("ماه: ");
        int month = input.nextInt();
        System.out.print("سال: ");
        int year = input.nextInt();

        int dayOfYear = day;

        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (isLeapYear(year)) {
                    dayOfYear += 29;
                } else {
                    dayOfYear += 28;
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dayOfYear += 30;
            } else {
                dayOfYear += 31;
            }
        }

        System.out.println("روز از سال :" + dayOfYear);
    }

    public static void convertToIslamicDate() {
        LocalDate gregorianDate = LocalDate.now();
        Scanner input = new Scanner(System.in);
        System.out.print("روز: ");
        int day = input.nextInt();
        System.out.print("ماه: ");
        int month = input.nextInt();
        System.out.print("سال: ");
        int year = input.nextInt();
        gregorianDate = LocalDate.of(year, month, day);

        HijrahDate islamicDate = HijrahChronology.INSTANCE.date(gregorianDate);
        String formattedDate = islamicDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("شمسی: " + formattedDate);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
