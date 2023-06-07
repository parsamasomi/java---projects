import java.util.Scanner;

public class CalendarGenerator {
    private int year;
    private int startDay;
    private int[][] daysInMonth = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},    // non-leap year
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}     // leap year
    };

    public CalendarGenerator(int year, int startDay) {
        this.year = year;
        this.startDay = startDay;
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void generateCalendar() {
        // Determine the day of the week the year starts
        int firstDayOfYear = startDay;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                firstDayOfYear = (firstDayOfYear + 366) % 7;
            } else {
                firstDayOfYear = (firstDayOfYear + 365) % 7;
            }
        }

        // Generate calendar
        StringBuilder calendar = new StringBuilder();
        calendar.append(String.format("%d\n\n", year));
        for (int month = 0; month < 12; month++) {
            calendar.append(String.format("%s\n", MONTH_NAMES[month]));
            calendar.append("Su Mo Tu We Th Fr Sa\n");

            // Add leading spaces for the first week
            for (int i = 0; i < firstDayOfMonth(year, month); i++) {
                calendar.append("   ");
            }

            // Add days of the month
            int daysInMonth = daysInMonth(year, month);
            for (int day = 1; day <= daysInMonth; day++) {
                calendar.append(String.format("%2d ", day));
                if ((firstDayOfMonth(year, month) + day) % 7 == 0) {
                    calendar.append("\n");
                }
            }

            // Add trailing spaces for the last week
            if ((firstDayOfMonth(year, month) + daysInMonth) % 7 != 0) {
                for (int i = 0; i < 7 - (firstDayOfMonth(year, month) + daysInMonth) % 7; i++) {
                    calendar.append("   ");
                }
                calendar.append("\n");
            }

            calendar.append("\n");
        }

        System.out.println(calendar.toString());
    }

    private int daysInMonth(int year, int month) {
        if (isLeapYear(year)) {
            return daysInMonth[1][month];
        } else {
            return daysInMonth[0][month];
        }
    }

    private int firstDayOfMonth(int year, int month) {
        int firstDayOfYear = startDay;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                firstDayOfYear = (firstDayOfYear + 366) % 7;
            } else {
                firstDayOfYear = (firstDayOfYear + 365) % 7;
            }
        }

        int daysBeforeMonth = 0;
        for (int i = 0; i < month; i++) {
            daysBeforeMonth += daysInMonth(year, i);
        }

        return (firstDayOfYear + daysBeforeMonth) % 7;
    }

    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the day of the week the year starts (1 for Monday, 7 for Sunday): ");
        int startDay = input.nextInt();

        CalendarGenerator calendar = new CalendarGenerator(year, startDay);
        calendar.generateCalendar();
    }
}